package homework.day2;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "이름: "+name;
    }
}

class Student extends Person {
    int studentNo;

    Student(String name, int studentNo) {
        super.setName(name);
        this.studentNo = studentNo;
    }

    public String toString() {
        return super.toString()+", 학번: "+studentNo;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Student std = new Student("홍길동", 1234);
        System.out.println(std.toString());
    }
}
