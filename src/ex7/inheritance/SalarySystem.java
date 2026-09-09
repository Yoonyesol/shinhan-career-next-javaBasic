package ex7.inheritance;

class Employee extends Object {
    int empNo;
    String empName;

    public String toString() {
        return "이름" + empName + "\t 사번" + empNo;
    }
}

class Permanent extends Employee {
    int baseSalary = 0;
    double bonus = 0.5;
}

public class SalarySystem {
    public static void main(String[] args) {
        Permanent p2 = new Permanent();
        p2.empNo = 2;
        p2.empName = "홍길동";
        p2.baseSalary = 500;
        System.out.println(p2);
    }
}
