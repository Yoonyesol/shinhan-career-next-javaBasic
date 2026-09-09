package ex10.mycomp.ui;

import ex10.mycomp.A1; // 패키지명을 생략하고 클래스명을 사용할 수 있다


public class B2 {
    public static void main(String[] args) {
        A1 a = new A1();
        ex10.mycomp.net.A1 a2 = new ex10.mycomp.net.A1(); // 일일이 다 써줘야 한다.
    }
}
