package ex17;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("c:/bit/cat.webp");
        FileOutputStream  fout =new FileOutputStream("c:/bit/cat22.webp");
        int count = 0 ;
        byte[] buffer = new byte[1024] ;
        while (count !=-1){
            count = fin.read(buffer) ;
            if(count!=-1)
                fout.write(buffer,0,count) ;
                //buffer에 있는 데이터를 0인덱스부터 count개를 씀
        }
    }
}