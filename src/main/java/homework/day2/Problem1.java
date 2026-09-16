package homework.day2;

class Vehicle {
    String brand;
    int speed;
    static int moveCount = 0;

    Vehicle(){
        moveCount++;
    }

    void move() {
//        System.out.println(moveCount+" 대가 달립니다");
        System.out.println(this.brand + "가(이) 시속 "+ this.speed+"km로 달립니다.");
    }

    public String toString() {
        return "브랜드: "+ this.brand + ", 속도: " + this.speed;
    }
}

class Car extends Vehicle {
    int doorCount;

    Car() {
        super();
    }

    public String toString() {
        return super.toString() + ", 문 개수: " + this.doorCount;
    }
}

class Truck extends Car {
    double loadWeight;

    Truck(){
        super();
    }

    public String toString() {
        return super.toString() + ", 적재중량: " + this.loadWeight;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        car.brand = "Genesis";
        car.doorCount = 4;
        car.speed = 150;

        truck.brand = "volvo";
        truck.doorCount = 2;
        truck.speed = 120;
        truck.loadWeight = 300;

        System.out.println("car: "+ car.toString());
        System.out.println("truck: " + truck.toString());
        truck.move();
        car.move();
    }
}
