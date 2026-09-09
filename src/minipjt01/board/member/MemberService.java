package minipjt01.board.member;


import java.util.ArrayList;

// 레파지토리 객체를 갖고 있으면서 회원 등록, 검색 등 관련 메서드를 가지고 있음
public class MemberService {
    MemberRepository memberRepository = new MemberRepository();

    //회원 등록
    public Long createMember(Long memberId, MemberRequestDto dto) {
        Member member = new Member();
        member.setId(memberId);
        member.setEmail(dto.getEmail());
        member.setNickname(dto.getNickname());
        member.setPassword(dto.getPassword());

        boolean isSuccessCreateMember =  memberRepository.save(member);
        if(!isSuccessCreateMember) { // 등록 실패
            throw new RuntimeException("유저 등록에 실패했습니다.");
        }
        return member.getId();
    }

    // 회원번호로 회원 검색
    public Member getMember(Long memberId) {
        Member member = memberRepository.findById(memberId);
        if(member == null) {
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }
        return member;
    }

    // 회원 이메일로 회원 검색
    public Member getMember(String email) {
        Member member = memberRepository.findByEmail(email);
        if(member == null) {
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }
        return member;
    }

    // 전체 회원 검색
    public ArrayList<Member> getMember() {
        ArrayList<Member> members = memberRepository.findAll();
        if(members == null) {
            throw new IllegalArgumentException("회원 목록이 존재하지 않습니다.");
        }
        return members;
    }
}