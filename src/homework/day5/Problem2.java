package homework.day5;

class PrintTask implements Runnable {
    int cnt = 0;
    int count;
    String message;
    PrintTask(String message, int count) {
        this.count = count;
        this.message = message;
    }

    public void run() {
        while (cnt++ < count) {
            try {
                Thread.sleep(100);
                System.out.println(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Thread pt1 = new Thread(new PrintTask("aaa", 10));
        Thread pt2 = new Thread(new PrintTask("bbb", 5));
        pt1.start();
        pt2.start();
    }
}
