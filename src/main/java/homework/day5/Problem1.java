package homework.day5;

class CountThread extends Thread {
    int count;
    String name;
    int cnt = 0;
    CountThread(String name, int count) {
        this.count = count;
        this.name = name;
    }

    public void run() {
        while (cnt++ < count) {
            System.out.println(name + " : " + cnt);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Thread pt1 = new Thread(new CountThread("A", 10));
        Thread pt2 = new Thread(new CountThread("B", 5));
        pt1.start();
        pt2.start();
    }
}
