package ex16.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp{
    int salary;
    String name;
    public String toString() {
        return this.name+"의 급여는 " + this.salary +" 입니다.";
    }
}

public class Test {  // 객체 직렬화 예제
    public static void main(String[] args) throws Exception {
        Comparator<Emp> c  =  (a, b) -> a.salary-b.salary;

        ArrayList<Emp> arr = new ArrayList<> ();
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        e1.salary = 200; e1.name = "권철우";
        e2.salary = 100; e2.name = "홍민영" ;
        arr.add(e1);
        arr.add(e2);
        Collections.sort(arr,c);
        System.out.println(arr);
    }
}

