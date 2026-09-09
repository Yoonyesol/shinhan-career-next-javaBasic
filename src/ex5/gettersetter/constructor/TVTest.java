package ex5.gettersetter.constructor;

class TV {
    TV() {
//        System.out.println();
        this(10);  // 생성자 호출, 첫 문장에만 가능
    }

    TV(int c) {
        System.out.println(c);
    }
}

public class TVTest {
    public static void main(String[] args) {
        TV one = new TV(); // 무인자 생성자 호출
    }
}
