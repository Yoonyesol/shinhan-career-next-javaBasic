package minipjt01.board.member;

import java.util.ArrayList;

// 회원정보를 저장하는 저장공간 관리하는 클래스. 원래 DB -> ArrayList에 저장하기
public class MemberRepository {

    //회원들을 저장하는 자료구조
    private static final ArrayList<Member> members = new ArrayList<>();

    //회원 번호로 회원 검색
    public Member findById(Long memberId){
        for(Member member: members) {
            if (member.getId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    //전체 회원 검색
    public ArrayList<Member> findAll(){
        return this.members;
    }

    //회원 등록
    boolean save(Member member){
        if(member == null) return false;

        members.add(member);
        return true; // 회원 등록을 성공하면 true를 리턴해야 합니다.
    }

    //회원 이메일로 회원 검색
    public Member findByEmail(String email){
        for(Member member: members) {
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }

    // arrayList 자체를 파일에 저장
    // 파일에 members  즉,  ArraryList 객체를 저장합니다.
    //(참고, ArraryList 객체 하나만 객체 직렬화해서 파일에 저장하면 그 안의 모든 member 객체가 같이 저장됨/
    boolean saveToFile(){
        return true ;
    }

    // 파일에서 ArraryList 객체를 읽어서 members에 로드 합니다.
    //(참고, ArraryList 객체 하나만 파일에서 읽어서 객체 역직렬화해서 그 안의 모든 member 객체가 같이 역직렬화됨
    boolean loadToFile(){

        return true ;
    }

}
