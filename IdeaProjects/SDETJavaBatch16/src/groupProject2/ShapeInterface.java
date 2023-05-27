package groupProject2;

import java.awt.*;

public interface ShapeInterface {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
    */
    double calculateArea(double a, double b);
    double calculatePerimiter(double a, double b);
}
class Circle implements ShapeInterface {
    @Override
    public double calculateArea(double a, double b) {
        double area = (a * (b * 2));
        return area;
    }
    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = 2 * a * b;
        return perimiter;
    }
}
class Square implements ShapeInterface {
    @Override
    public double calculateArea(double a, double b) {
        double area = a * b;
        return area;
    }
    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = a * b;
        return perimiter;
    }
}
class ShapeInterfaceTester {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(3.14, 2));
        System.out.println(circle.calculatePerimiter(3.14, 4));

        Square square = new Square();
        System.out.println(square.calculateArea(4, 4));
        System.out.println(square.calculatePerimiter(2, 8));
    }
}
