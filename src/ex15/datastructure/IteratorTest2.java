package ex15.datastructure;
import java.util.*;

public class IteratorTest2{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        A aaa = new A(); aaa.i = 10;

//        ts.add(aaa); -> 객체 동일한 것 두개 저장 -> 에러 : Comparator 타입의 사용자 정의 클래스는 비교 메서드를 제공해야 함
//        ts.add(aaa); ->
//        ts.add(1);
//        ts.add(1);
//        ts.add(10);
//        ts.add(5);

        visitAll(ts);
        System.out.println("=====");
        ts.forEach(System.out::println);
    }

    public static void visitAll(Collection ccc){
        Iterator iii = ccc.iterator(); // iterator: 처음부터 끝까지 객체를 모두 꺼내볼 수 있는 함수

        while (iii.hasNext()) { // 꺼낼 게 있는가
            System.out.println(iii.next()); // 실제 값을 꺼내기
        }
    }
}