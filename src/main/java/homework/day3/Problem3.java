package homework.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        arr.add(new Employee("홍길동", 3000));
        arr.add(new Employee("김길동", 8000));
        arr.add(new Employee("최길동", 6000));
        for (Employee e: arr) {
            System.out.println("이름: "+e.name+ ", 세후급여: "+e.calculatePay());
        }

        System.out.println("세후 급여가 높은 순대로");
        Collections.sort(arr, Comparator.comparingDouble(e -> e.calculatePay()));
        for (Employee e: arr) {
            System.out.println("이름: "+e.name+ ", 세후급여: "+e.calculatePay());
        }
    }
}
