package homework.day3;

interface Payable {
    double TAX_RATE = 0.1;
    double calculatePay();
}

class Employee implements Payable{
    String name;
    int baseSalary;

    Employee(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePay() {
        return this.baseSalary - (this.baseSalary * TAX_RATE);
    }

    final void printCompany(){};
}

public class Problem1 {
    public static void main(String[] args) {
        Employee[] Payable = { new Employee(1300), new Employee(2000),
                new Employee(3400), new Employee(8000)};

        for(Employee p: Payable) {
            System.out.println(p.calculatePay());
        }
    }
}
