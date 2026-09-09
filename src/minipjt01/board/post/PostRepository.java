package minipjt01.board.post;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PostRepository {

    //게시판 글을 저장하는 자료구조
    private final ArrayList<Post> board = new ArrayList<>();
    private long pid = 0L;

    //게시글 번호로 게시글 검색
    Post findById(Long postId){
        for(Post p: board) {
            if(p.getId().equals(postId)) {
                return p;
            }
        }
        return null;
    }

    //전체 글 검색
    public ArrayList<Post> findAll(){
        return this.board;
    }

    //게시글 등록
    boolean save(Post post){
        if(post == null) return false;

        pid++;
        post.setId(pid);
        board.add(post);
        return true; // 게시글 등록을 성공하면 true를 리턴해야 합니다.
    }

    boolean delete(Long postId) {
        Post post = findById(postId);
        if(post == null) return false;

        post.setStatus(PostStatus.DELETED);
        return true;
    }

    // 제목에 매개인자의 키워드가 포함된 경우의 게시글 목록
    ArrayList<Post> findTitleContaining(String keyword){
        ArrayList<Post> arr = board.stream().
                filter(b -> b.getTitle().contains(keyword))
                .collect(Collectors.toCollection(ArrayList::new));
        if(!arr.isEmpty()) return arr;
        return null;
    }

    // 파일에 board(게시판 글을 저장하는 자료구조)즉,ArraryList 객체를 저장합니다.
    //(참고, ArraryList 객체 하나만 객체 직렬화해서 파일에 저장하면 그 안의 모든 post 객체가 같이 저장됨/

    boolean saveToFile() {
        try(ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("board.txt"))) {
            oo.writeObject(board);
            oo.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true ;
    }

    // 파일에서 ArraryList 객체를 읽어서 board(게시판 글을 저장하는 자료구조)에 로드 합니다.
    //(참고, ArraryList 객체 하나만 파일에서 읽어서 객체 역직렬화해서 그 안의 모든 post 객체가 같이 역직렬화됨
    boolean loadToFile() {
        try(ObjectInput oi = new ObjectInputStream(new FileInputStream("board.txt"))) {
            Object obj = oi.readObject();
            ArrayList<Post> savedList = (ArrayList<Post>) obj;

            board.clear();
            board.addAll(savedList);

            if(!board.isEmpty()) {
                this.pid = board.getLast().getId();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true ;
    }
}