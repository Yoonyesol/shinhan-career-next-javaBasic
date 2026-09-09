package ex7.abstractEx;

class A {

}

abstract class Shape {   // 추상메소드가 하나라도 이씅면 반드시 추상 클래스여야 함
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("원 그림");
    }
}

public class Test {
    public static void main(String[] args) {
//        A a = new A();  // 오류. 추상클래스틑 객체 생성 불가
    }
}
