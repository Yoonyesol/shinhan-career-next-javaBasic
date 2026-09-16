package ex1.classes;

/*
* Car 클래스 생성
* 인스턴스 변수: String ownername, int speed
* static 변수: int cnt
* */
class Car {
    String ownername;
    int speed;
}


public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        // Car 객체 2개 생성 후 값 할당하고 출력
        car1.ownername ="김민수";
        car1.speed = 1003;

        Car car2 = new Car();
        // Car 객체 2개 생성 후 값 할당하고 출력
        car2.ownername ="최영희";
        car2.speed = 20;

        System.out.println(car1.ownername);
        System.out.println(car1.speed);
        System.out.println(car2.ownername);
        System.out.println(car2.speed);
    }
}
