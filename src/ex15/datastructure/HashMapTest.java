package ex15.datastructure;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        String name = "김선영";
        hm.put(name, 100);
        hm.put("박철수", 100);
        hm.put("박철수", 90); // 키 값이 유일해야 함

        System.out.println(hm.get("박철수"));
        System.out.println(hm.get(name));
    }
}

// 인터페이스의 접근제한은 자동으로 public abstract가 붙으므로, public임
interface I {
    void m(); // 인터페이스 아닌 경우: 디폴트(패키지) 접근제한
}

class AA implements I {
    public void m() { // 그냥 void만 쓰면 안됨 (인터페이스는 기본이 public이므로)
        System.out.println("m");
    }
}