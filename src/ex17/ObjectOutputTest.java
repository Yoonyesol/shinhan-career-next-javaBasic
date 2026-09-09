package ex17;

import java.io.*;

public class ObjectOutputTest {
    public static void main(String[] args) throws IOException {
        ObjectOutput oo = new ObjectOutputStream(
                new FileOutputStream("object.dat"));
        oo.writeObject("Today"); // String 객체를 직렬화해서 파일에 저장
        oo.writeObject(new java.util.Date());
        oo.writeDouble(Math.PI);
        oo.flush();
    }
}
