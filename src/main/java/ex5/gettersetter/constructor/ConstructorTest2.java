package ex5.gettersetter.constructor;

class Emp {
    String name;
    static int cnt;

    // 생성자, 객체 생성 시 처리해야 할 내용을 작성
    Emp(String name) {
        this.name = name;
        cnt += 1;
    }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
        Emp me = new Emp("홍길동");
        System.out.println(me.name);
        System.out.println(Emp.cnt);
        // 생성자가 하나라도 생기면 생성자 자동생성이 안됨
//        Emp me1 = new Emp();
    }
}
