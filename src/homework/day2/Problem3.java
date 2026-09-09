package homework.day2;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(4, 5), new Circle(1) };

        for(int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}