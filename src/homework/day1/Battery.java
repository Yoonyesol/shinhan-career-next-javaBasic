package homework.day1;

public class Battery {
    int battery;
    static int width;
    static int height;

    void charge(int a) {
        battery += a;
    }

    void consume(int a) {
        battery -= a;
    }

    static void print() {
        System.out.println(width);
        System.out.println(height);
    }
}
