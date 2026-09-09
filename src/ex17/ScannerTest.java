package ex17;

import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        int i = System.in.read();

        InputStreamReader r = new InputStreamReader(System.in);
        // System.in은 inputStream (byte 단위 전송 즉 유니코드 문자로 바꾸지 않음.)


    }
}
