package homework.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 1. Serializable 인터페이스 구현 (직렬화 대상 지정)
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Problem5 {
    public static void main(String[] args) {
        String fileName = "person.dat";
        Person originalPerson = new Person("홍길동", 25);

        // 2. FileOutputStream + ObjectOutputStream으로 객체 파일에 저장
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(originalPerson);
            System.out.println("객체 저장 완료: " + originalPerson);

        } catch (IOException e) {
            System.err.println("파일 저장 실패: " + e.getMessage());
        }

        // 3. FileInputStream + ObjectInputStream으로 객체 복원 및 Person 형변환
        // 4. IOException, ClassNotFoundException 예외 처리
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person restoredPerson = (Person) ois.readObject();
            System.out.println("객체 복원 성공: " + restoredPerson);
            System.out.println("이름: " + restoredPerson.getName() + ", 나이: " + restoredPerson.getAge());

        } catch (IOException e) {
            System.err.println("파일 읽기 실패: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("클래스를 찾을 수 없습니다: " + e.getMessage());
        }
    }
}