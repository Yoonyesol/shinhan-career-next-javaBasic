package homework.day5;

class Account {
    long balance = 10000;
    synchronized void deposit(int amount) {
        balance += amount;
    }
}

class EX2 implements Runnable {
    Account c = new Account();

    public void run() {
        for (int i = 0; i < 100; i++) {
            c.deposit(1000);
        }
    }
}

public class Problem5 {
    public static void main(String[] args) throws InterruptedException {
        EX2 e = new EX2();
        Thread ex1 = new Thread(e);
        Thread ex2 = new Thread(e);
        ex1.start(); ex2.start();
        ex1.join(); ex2.join();
        System.out.println(e.c.balance);
    }
}