package ex1.classes;

class Robot {
    String name; // instance 멤버 변수
    int energy; // instance 멤버 변수
    static int cnt; // static 멤버 변수 -> 모든 클래스가 공유할 수 있는 값. heap 영역이 아닌 다른 곳에 저장됨
    static void print() {
        // char name = 'a'; // 지역변수
        // System.out.println(name); // 지역변수에 없으면, 멤버 변수
        // this.name으로 코드가 바뀐다
    }

    static void print2() {
        System.out.println(cnt);
        // System.out.println(name); // 오류. staticc method에서는 객체.~ 없이 인스턴스 변수나 인스턴스 메소드 사용 불가

        Robot r = new Robot();
        System.out.println(r.name); // 이건 가능함 (클래스 내부 변수 참조는 가능)
    }
}

/*
* 어디에서 선언되었는지에 따라
* 지역변수: 메소드 안에서 선언한 변수 (자동 초기화 되지 않음. 반드시 초기화 해야 함)
* 멤버변수: 클래스 안에서 선언한 변수 (자동 초기화)
* - instance(멤버) 변수, 접근방법: 객체이름.instance
* - static(멤버) 변수: static 키워드를 사용한 변수, 접근방법: 클래스이름.static
* */

public class RobotTest {
    public static void main(String[] args) {
        // Robot 객체를 두 개 만들고, 각각 값을 설정하고, 출력
        Robot robot1 = new Robot();
        robot1.energy = 100; // 멤버 변수, 자동 초기화 된다
        robot1.name = "Kim";
        Robot.cnt = 1; robot1.cnt = 1; // static 변수 둘 다 가능, 전자가 권장사항임

        int i = 1; // 지역 변수
        System.out.println(i); // 초기화하지 않을 시 오류 남

//        float f = 3.14; // 에러 발생 (F를 뒤에 붙여줘야 대입이 가능하다)

        Robot robot2 = new Robot();
        robot2.energy = 30;
        robot2.name = "Lee";

        Robot.cnt = 2; robot2.cnt = 2;
        System.out.println(robot1.cnt); // 2

        robot1.print();
        robot2.print();
    }
}