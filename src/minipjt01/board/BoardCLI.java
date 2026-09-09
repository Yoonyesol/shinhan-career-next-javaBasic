package minipjt01.board;

import minipjt01.board.member.MemberRequestDto;
import minipjt01.board.member.MemberService;
import minipjt01.board.post.Post;
import minipjt01.board.post.PostRequestDto;
import minipjt01.board.post.PostService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardCLI {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MemberService memberService = new MemberService();
        PostService postService = new PostService();

        long userId = 0;
        int input;

        postService.loadData();

        // 여러줄 문자열  """    """
        String initMessage = """  
                <  게시판메뉴   >
                1. 전체 글 보기 
                2. 회원 등록 
                3. 글 등록  
                4. 글 삭제
                5. 종료  
                """ ;
        // 위의 메뉴를 구현 하세요.

        while(true) {
            System.out.print(initMessage);
            System.out.print("메뉴 선택: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            sc.nextLine();

            if(input == 5) {
                System.out.println("프로그램을 종료합니다.");
                postService.saveData();
                break;
            } else if(input == 1) {
                System.out.println();

                ArrayList<Post> post = postService.getPost();
                if (post.isEmpty()) {
                    System.out.println("등록된 글이 없습니다.");
                    continue;
                };

                for(Post p: post) {
                    System.out.println("["+ p.getId() + "] "
                    + p.getTitle() + ", 글내용: "+p.getContent()
                    + ", 글 작성자: "+p.getWriter().getNickname() + ", 작성일자: ("+ p.getCreatedAt() +")"); ;
                }
            }
            else if (input == 2) {
                System.out.println();

                System.out.print("이메일: ");
                String email = sc.next();

                System.out.print("비밀번호: ");
                String password = sc.next();

                System.out.print("닉네임: ");
                String nickname = sc.next();

                try {
                    // dto에 유저 입력 저장
                    MemberRequestDto memberDTO = new MemberRequestDto();
                    memberDTO.setPassword(password);
                    memberDTO.setNickname(nickname);
                    memberDTO.setEmail(email);

                    userId++;
                    long uid = memberService.createMember(userId, memberDTO);
                    System.out.println(uid+"번 회원의 정보를 등록하였습니다.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (input == 3){
                System.out.println();
                System.out.print("작성자 회원번호: ");
                Long writerId = sc.nextLong();

                System.out.print("제목: ");
                String title = sc.next();

                System.out.print("내용: ");
                String content = sc.next();

                try {
                    PostRequestDto postDTO = new PostRequestDto();
                    postDTO.setTitle(title);
                    postDTO.setContent(content);

                    long pid = postService.createPost(writerId, postDTO);
                    System.out.println("글 등록 완료! 글번호: " + pid);
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } else if (input == 4) {
                System.out.print("삭제할 글번호: ");
                Long postId = sc.nextLong();

                try {
                    if(postService.deletePost(postId)) System.out.println(postId+"번 글 삭제 완료");
                    else System.out.println("등록된 글이 없습니다.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //프로그램 시작하지 마자 파일에서 게시판글들과 회원 정보를 로드합니다.
        //Repository클래스에 loadToFile  호출
        //프로그램 종료 시 파일에 게시판글들과 회원 정보를 저장합니다.
        //Repository클래스에 saveToFile  호출
    }
}