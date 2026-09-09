package homework.day4;

import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        arr.stream()
                .filter(el -> el % 2 == 0)
                .map(el -> el * el)
                .forEach(System.out::println);

        arr.stream().sorted((a, b) -> Integer.compare(b, a))
                .forEach(System.out::println);
    }
}
