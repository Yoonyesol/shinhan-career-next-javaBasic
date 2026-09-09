package ex13.exceptionEx;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest7 {
    public static void main(String[] args) throws FileNotFoundException { // 자바가상머신에게 예외던짐 -> 예외처리 안 한 것처럼 프로그램 종료됨
        // FileReader fr1 = new FileReader("a.txt"); // FileReader 생성자에서 FileNotFoundException을 throws하고 있으므로, 이에 대한 예외처리가 필요하다
        FileReader fr1 = new FileReader("a.txt");

    }
}