package ex15.datastructure;

import java.io.*;
import java.util.*;

public class ObjectInputTest {
    public static void main(String[] args) throws Exception {
        ObjectInput oi = new ObjectInputStream(
                new FileInputStream("object.data"));
        String today = (String)oi.readObject();
        Date date = (Date)oi.readObject();
        double d2 = oi.readDouble();
        A a = (A)oi.readObject();
    }
}
