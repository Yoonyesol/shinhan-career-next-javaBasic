package homework.day5;

class SumThread extends Thread {
    long total = 0;

    @Override
    public void run() {
        for(long i = 0; i <= 1000000; i++) {
            total += i;
        }
    }
}

public class Problem3 {
    public static void main(String[] args) throws InterruptedException {
        SumThread t1 = new SumThread();
        t1.start();
        // t1.join();
        System.out.println(t1.total);
    }
}