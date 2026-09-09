package ex14.objectEx;
import java.lang.Cloneable; //java.lang 패키지는 import 안 해도 된다

// Clonable 인터페이스 같은 경우는 추상 메서드가 없다.
// flag 인터페이스 (표식만 해주는 역할) - java.lang에 존재하는 인터페이스 중 flag: Serializable(직렬화)
class Card implements Cloneable {
    int id;

    // Object의 clone() 재정의 (Object의 clone()은 protected)
    // 재정의 시, 접근 제한자는 동일하거나 더 넓은 범위의 접근제한자는 가능
    public Object clone() throws CloneNotSupportedException { // cloneable의 추상메서드 구현
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Card one = new Card();
        one.id = 432;
        Card two = (Card) one.clone(); // 다운캐스팅이기 때문에 명시적 타입캐스팅 해주어야 함, Clonable 하위만 복제 가능
        System.out.println(two.id);

        Card three = one; // 두 개가 동일 객체를 가리킴
        one.id = 1111;
        System.out.println(one.id); // 43242
        System.out.println(two.id);  // 11111
        System.out.println(three.id); // 11111 (one 과 같은 주소를 가지고 있음)
    }
}