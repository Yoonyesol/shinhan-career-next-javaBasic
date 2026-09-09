package homework.day1;

class Calculator {
    double result = 0;

    void add(double a) {
        result += a;
    }

    void subtract(double a) {
        result -= a;
    }

    void multiply(double a) {
        result *= a;
    }

    void divide(double a) {
        result /= a;
    }

    void reset() {
        result = 0;
    }
}
