package homework.day4;

import java.io.*;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        FileWriter fout = null;
        Scanner sc = null;

        // 1. 파일 쓰기
        try {
            fout = new FileWriter("c:/bit/students.txt");
            fout.write("홍길동, 95\n");
            fout.write("김길동, 56\n");
            fout.write("박길동, 88\n");
        } catch (IOException e) {
            System.out.println("파일 쓰기 중 에러 발생: "+e.getMessage());
        } finally {
            if(fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.err.println("파일 닫기 실패");
                }
            }
        }

        // 2. 파일 읽기
        try {
            File file = new File("c:/bit/students.txt");
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] parts = line.split(",");
                String name = parts[0];
                String score = parts[1];

                System.out.println("이름: " + name + ", 점수: " + score);
            }
        }  catch (FileNotFoundException e) {
            System.err.println("파일 쓰기 중 에러 발생: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}