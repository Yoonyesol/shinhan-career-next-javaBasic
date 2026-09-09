package ex13.exceptionEx;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try{
            int i = 0;
            int result = 10/i;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("예외 발생");
        }
        System.out.println("종료");
    }
}
