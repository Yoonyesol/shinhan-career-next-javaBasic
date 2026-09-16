package ex17;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        // 파일에서 데이터를 끌고 올 수 있는 길(스트림)을 만듬
        FileInputStream fin = new FileInputStream("c:/bit/a.txt");
        int count = 0;
        byte[] buffer = new byte[1024]; // 한번에 1K씩 가져오게
        while (count != -1){  // 끝까지 다 읽음
            count = fin.read(buffer);
            if(count != -1) System.out.write(buffer, 0, count); // 0번부터 count 개수까지 출력
        }
        fin.close(); // 파일 닫아주기

        System.out.println(97); // flush 해줌
        System.out.write(97); // a 출력, 데이터가 어느정도 양이 모여야 한번에 보내준다.
        System.out.flush(); // 데이터가 충분히 모이지 않아도 보내기
    }
}