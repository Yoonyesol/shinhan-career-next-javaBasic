package ex3.staticex;

class Employee {
    static int cnt;
    static void print() {
        System.out.println(cnt);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee.cnt = 1;
        Employee.print();   // 내 클래스가 아닌 Employee 클래스에서 static 메서드를 찾는다
        test(); // 내 클래스에 해당 함수 존재 시, 오류가 나지 않는다.
        // STATIC 메서드 안에서는 (객체변수.~ 없이)
        // instance 변수나 instance 메서드 사용 불가
    }

    static void test() {
        System.out.println("test");
    }
}
