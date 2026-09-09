package minipjt01.board.post;

import minipjt01.board.member.Member;
import minipjt01.board.member.MemberRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PostService {
    MemberRepository memberRepository = new MemberRepository();
    PostRepository postRepository = new PostRepository();

    //게시글 등록
    public Long createPost(Long memberId, PostRequestDto dto) {
        Member member = memberRepository.findById(memberId);
        if (member == null) return null;

        Post post = new Post();
        post.setContent(dto.getContent());
        post.setTitle(dto.getTitle());
        post.setWriter(member);

        if (postRepository.save(post)) return post.getId();
        return null;
    }

    // 글번호로 게시글 검색
    public Post getPost(Long postId) {
        return postRepository.findById(postId);
    }

    // 전체 글 (삭제되지 않은) 검색
    public ArrayList<Post> getPost() {
        ArrayList<Post> posts = postRepository.findAll();

        if(posts == null) return null;
        return posts.stream()
                .filter(p -> p.getStatus() != PostStatus.DELETED)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 키워드로 글 (삭제되지 않은) 검색
    public ArrayList<Post> getPost(String keyword) {
        ArrayList<Post> posts = postRepository.findTitleContaining(keyword);

        if(posts == null) return null;
        return posts.stream()
                .filter(p -> p.getStatus() != PostStatus.DELETED)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 글 삭제
    public boolean deletePost(Long postId){
        // 단, post.setStatus(PostStatus.DELETED);
        // 실제로 지우지 않고 상태만 변경(소프트 삭제)
        return postRepository.delete(postId); // 삭제 성공시 true 반환
    }

    public boolean loadData() throws IOException, ClassNotFoundException {
        return postRepository.loadToFile();
    }

    public boolean saveData() throws IOException {
        return postRepository.saveToFile();
    }
}
