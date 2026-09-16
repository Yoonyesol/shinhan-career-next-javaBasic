package ex16;

interface I {
    void m();
}

//이름이 있는 클래스  (기존 방식)
class A implements I {
    @Override
    public void m() {
        System.out.println("m");
    }
}

//----------------------------------------------------------

public class anonymous {

    public static void main(String[] args) {
        I a1 = new A();
        a1.m();

        /* 만약, A클래스를 단 한번만 사용하고 사용하지 않는다면 이름없이 다음과 같이 익명 클래스로 사용할 수 있음.*/
        I a2 = new I(){  //Anonymous Class 내가 만들고자 하는 변수의 상위타입을 써준다.
            public void m() {
                System.out.println("m");
            }
        };
        // 람다 함수로 메서드 명 축약
        // 만약 구현하고자 하는 인터페이스가 메서드가 하나면,
        // 그 메서드 정의 부분도 코딩 생략 가능 > 자바 람다
        a2.m();
    }
}