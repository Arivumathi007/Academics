import java.util.Scanner;

// Define the interface ShapeCalculator
interface ShapeCalculator {
    void calc(int n);
}

// Class Square implementing ShapeCalculator
class Square implements ShapeCalculator {
    public void calc(int n) {
        int area = n * n;
        int perimeter = 4 * n;
        System.out.println(area + " " + perimeter);
    }
}

// Class Circle implementing ShapeCalculator
class Circle implements ShapeCalculator {
    public void calc(int n) {
        double area = Math.PI * n * n;
        double perimeter = 2 * Math.PI * n;
        System.out.printf("%.2f %.2f\n", area, perimeter);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read input

        // Create objects of Square and Circle
        ShapeCalculator square = new Square();
        ShapeCalculator circle = new Circle();

        // Calculate and display results
        square.calc(n);
        circle.calc(n);
    }
}
