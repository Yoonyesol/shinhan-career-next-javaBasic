package ex16.streamEx;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "김철수", "이영희", "박민수", "김영희", "금희"); // 객체를 ArrayList로 바꿔준다.
        names.stream().filter(name -> name.startsWith("김"))
                .forEach(System.out::println);

        names.stream().map(String::length)
                .forEach(System.out::println);

        long count = names.stream().filter(name -> name.startsWith("김"))
                .count();

        System.out.println(count);
        System.out.println("---------");

        // 이름이 '희'로 끝나는 사람ㅇ의 이름 글자가 3 이상이면 '이름 글자 수' 출력
        names.stream()
                .filter(name -> name.endsWith("희"))
                .map(String::length)
                .filter(cnt -> cnt >= 3)
                .forEach(System.out::println);
    }
}