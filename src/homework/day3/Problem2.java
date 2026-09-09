package homework.day3;

class Account {
    double balance = 100000;
    void withdraw(int amount) throws InsufficientBalanceException{
        if (this.balance < amount) throw new InsufficientBalanceException("");
        this.balance -= amount;
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Account ac = new Account();

        try {
            ac.withdraw(1000000);
        } catch (InsufficientBalanceException e) {
            System.out.println("잔액 부족 - 거래 불가");
        } finally {
            System.out.println("거래 종료");
        }
    }
}
