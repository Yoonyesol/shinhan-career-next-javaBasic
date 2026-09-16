package ex17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fin = new FileReader("c:/bit/a.txt");
        BufferedReader br = new BufferedReader(fin);
        String line = "" ; // 유니코드를 변환해서 읽어오므로 String으로 저장 가능
        while(  (  line = br.readLine() ) !=null )   	    // 한 라인을 읽음.
        {  	   System.out.println("읽어온 데이터 " + line)  ;
        }      // 읽을 것이 없다는 시그널 읽으면 null 반환
        br.close(); fin.close();
    }
}