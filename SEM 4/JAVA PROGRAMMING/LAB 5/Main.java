import java.util.Scanner;

abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

class Area extends Shape {
    void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    void squareArea(double side) {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }

    void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        Area area = new Area();
        area.rectangleArea(length, breadth);
        area.squareArea(side);
        area.circleArea(radius);

        scanner.close();
    }
}
