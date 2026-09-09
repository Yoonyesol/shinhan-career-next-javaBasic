package ex17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("c:/bit/rrr.txt");
        PrintWriter pw = new PrintWriter(fout);
        pw.println(10);
        fout.write("aa\n");
        pw.println(new java.util.Date());
        pw.close();
        fout.close();

        System.err.println("에러");
    }
}