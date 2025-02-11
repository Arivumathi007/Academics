import java.util.Scanner;

abstract class ShapeMath {
    abstract void rectanglePerimeter();
    abstract void squarePerimeter();
    abstract void trianglePerimeter();
    abstract void trapezoidPerimeter();
    abstract void circlePerimeter();
}

class Perimeter extends ShapeMath {
    // Perimeter values of the shapes
    double rectanglePerimeterValue = 0.0, squarePerimeterValue = 0.0, trianglePerimeterValue = 0.0, 
        trapezoidPerimeterValue = 0.0, circlePerimeterValue = 0.0;

    // Inputs
    double length, breadth, sideSquare;
    double side1, side2, side3;
    double trapezoidSide1, trapezoidSide2, trapezoidSide3, trapezoidSide4;
    double radius;

    public void rectanglePerimeter() {
        rectanglePerimeterValue = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeterValue);
    }

    public void squarePerimeter() {
        squarePerimeterValue = 4 * sideSquare;
        System.out.println("Square Perimeter: " + squarePerimeterValue);
    }

    public void trianglePerimeter() {
        trianglePerimeterValue = side1 + side2 + side3;
        System.out.println("Triangle Perimeter: " + trianglePerimeterValue);
    }

    public void trapezoidPerimeter() {
        trapezoidPerimeterValue = trapezoidSide1 + trapezoidSide2 + trapezoidSide3 + trapezoidSide4;
        System.out.println("Trapezoid Perimeter: " + trapezoidPerimeterValue);
    }

    public void circlePerimeter() {
        circlePerimeterValue = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + circlePerimeterValue);
    }

    public void calculateSum() {
        double sum = rectanglePerimeterValue + squarePerimeterValue + trianglePerimeterValue +
                     trapezoidPerimeterValue + circlePerimeterValue;
        System.out.println("Sum of all perimeters: " + sum);
    }

    public void sortPerimeter() {
        List<Double> perimeters = new ArrayList<>();
        perimeters.add(rectanglePerimeterValue);
        perimeters.add(squarePerimeterValue);
        perimeters.add(trianglePerimeterValue);
        perimeters.add(trapezoidPerimeterValue);
        perimeters.add(circlePerimeterValue);

        Collections.sort(perimeters);

        System.out.println("Perimeter in sorted order: " + perimeters);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();
        Scanner scanner = new Scanner(System.in);

        // First line: length and breadth for the rectangle
        System.out.println("Enter length and breadth of rectangle:");
        perimeter.length = scanner.nextDouble();
        perimeter.breadth = scanner.nextDouble();

        // Second line: side of the square
        System.out.println("Enter side of the square:");
        perimeter.sideSquare = scanner.nextDouble();

        // Third line: three sides of the triangle
        System.out.println("Enter three sides of the triangle:");
        perimeter.side1 = scanner.nextDouble();
        perimeter.side2 = scanner.nextDouble();
        perimeter.side3 = scanner.nextDouble();

        // Fourth line: four sides of the trapezoid
        System.out.println("Enter four sides of the trapezoid:");
        perimeter.trapezoidSide1 = scanner.nextDouble();
        perimeter.trapezoidSide2 = scanner.nextDouble();
        perimeter.trapezoidSide3 = scanner.nextDouble();
        perimeter.trapezoidSide4 = scanner.nextDouble();

        // Fifth line: radius of the circle
        System.out.println("Enter radius of the circle:");
        perimeter.radius = scanner.nextDouble();

        // Trigger methods
        perimeter.rectanglePerimeter();
        perimeter.squarePerimeter();
        perimeter.trianglePerimeter();
        perimeter.trapezoidPerimeter();
        perimeter.circlePerimeter();

        perimeter.calculateSum();
        perimeter.sortPerimeter();

        scanner.close();
    }
}
