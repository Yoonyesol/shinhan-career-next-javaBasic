package homework.day1;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        cal1.result = 50;
        cal1.multiply(5.2);
        cal1.divide(10);
        cal1.add(1000);
        System.out.println(cal1.result);

        cal2.result = 90;
        cal2.multiply(1000);
        cal2.divide(30);
        cal2.subtract(10);
        System.out.println(cal2.result);
    }
}
