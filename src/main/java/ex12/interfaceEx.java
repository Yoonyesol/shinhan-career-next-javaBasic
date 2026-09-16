package ex12;

interface Drawable {
    int PLAIN_PEN = 1; // public static final이 앞에 자동으로 붙는다
    int BOLD_PEN = 2;
    void draw(); // public abstract (추상 메서드로 만들어진다)
    void move(int x, int y);
}

interface Drawable2D extends Drawable {
}

// 클래스와 인터페이스는 implements
class Bear implements Drawable { // 추상메서드 구현 안하고 abstract 아니면 에러남
    @Override //
    public void draw() {

    }

    @Override
    public void move(int x, int y) {

    }

}

class Car {
    void run(){

    }
}

// @annotation 주석 : 컴파일러와 실행환경에 전달하는 주석
class Sonata extends Car {
    void run(){
        System.out.println("SONATA 달리");
    }
}

public class interfaceEx {

}
