package ex19.threadEx;

class Ex extends Thread {
    public void run() { // 무한 루프. 강제 종료 해야 함
        int cnt = 0;
        while(cnt++ < 50) {
            try {
                Thread.yield(); // 양보 (다른 쓰레드에게)
                                // yield() 양보해도 우선순위가 높은 쓰레드가 더 많은
                // Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        Ex ex1 = new Ex(); ex1.setPriority(0);
        Ex ex2 = new Ex(); ex2.setPriority(1);
        ex1.start(); // run()은 main 쓰래드가 작업.
        ex2.start(); // 새로운 작업자에게 일을 시키는 것
    }
}
