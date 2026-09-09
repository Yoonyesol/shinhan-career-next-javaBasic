package ex18;

// enum이 없을 때
class OrderStatus1 {
    public static int PAID = 0;
    public static int DELIVERED = 1;
    public static int CANCELLED = 2;
}

// enum 사용
enum OrderStatus2 {
    PAID,
    DELIVERED,
    CANCELLED
}

public class EnumTest {
    public static void main(String[] args) {
        OrderStatus2 orderState2 = OrderStatus2.DELIVERED;  // enum 타입으로 변수 선언을 하면 상태정보가 모두 들어가는 오류가 줄어든다.
        int orderState1 = OrderStatus1.DELIVERED;
        int orderState = 3; // 컴파일 오류를 못 찾아냄
        System.out.println(OrderStatus1.PAID);
        System.out.println(OrderStatus2.PAID);
    }
}
