package homework.day4;

import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(100);
        arr.add(50);
        arr.add(90);
        arr.set(1, 45);
        arr.remove(Integer.valueOf(90));
        arr.forEach(System.out::println);
    }
}
