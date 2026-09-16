package ex15.datastructure;

import java.util.ArrayList;

public class arrayListEx {
    public static void main(String[] args) {
        // 타입 지정: 오류 감소 효과
        ArrayList<String> arr = new ArrayList<String>();
        // arr.add(2);
        arr.add("test");

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i)); // 제네릭 안 쓰는 경우 반환형은 Object
        }

        arr.forEach(System.out::println);

        ArrayList<String> a = m(); // arrayList 반환
        Object o = a.get(0);
    }

    static ArrayList<String> m(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("aa");
        return a;
    }
}
