package homework.day5;

class Counter extends Thread {
    int i = 0;

    synchronized void increment() {
        i++;
    }
}

class EX implements Runnable {
    Counter c = new Counter();

    public void run() {
        for (int i = 0; i < 100000; i++) {
            c.increment();
        }
    }
}

public class Problem4 {
    public static void main(String[] args) throws InterruptedException {
        EX e = new EX();
        Thread ex1 = new Thread(e);
        Thread ex2 = new Thread(e);
        ex1.start(); ex2.start();
        ex1.join(); ex2.join();
        System.out.println(e.c.i);
    }
}
