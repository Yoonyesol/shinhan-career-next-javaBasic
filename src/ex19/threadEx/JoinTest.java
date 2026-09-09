package ex19.threadEx;

import java.util.Scanner;

public class JoinTest implements Runnable {
    Scanner br = new Scanner(System.in);
    static String name = "";

    @Override
    public void run() {
        System.out.println("이름을 입력하세요");
        name = br.nextLine();
        System.out.println("입력받은 이름: " + name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinTest());
        t1.start();
        t1.join();  // 다른 스레드의 작업 결과가 필요할 때 그 스레드를 조인한다.
        System.out.println(name);
    }
}
