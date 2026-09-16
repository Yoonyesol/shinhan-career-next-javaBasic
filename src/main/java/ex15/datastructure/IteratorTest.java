package ex15.datastructure;
import java.util.*;

class A {
    int i;
    public String toString(){
        return ""+i; // 숫자형 타입의 i를 문자열로 변경
    }
}

public class IteratorTest{
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        A aaa = new A(); aaa.i = 10;
        hs.add(aaa);
        hs.add(aaa);
        hs.add(1);
        // set은 같은 객체를 두 번 저장해도 한번만 저장됨
        // set은 순서가 없어서 인덱스도 없음 -> 인덱스를 이용한 출력 불가

        visitAll(hs); // 처음부터 끝까지 출력해주는 코드 -> 결과값: 중복 저장 X, 순서 보장 X
        hs.forEach(System.out::println); // 스트림 api, 위 코드와 동일한 결과
    }

    public static void visitAll(Collection ccc){
        Iterator iii = ccc.iterator(); // iterator: 처음부터 끝까지 객체를 모두 꺼내볼 수 있는 함수

        while (iii.hasNext()) { // 꺼낼 게 있는가
            System.out.println(iii.next()); // 실제 값을 꺼내기
        }
    }
}