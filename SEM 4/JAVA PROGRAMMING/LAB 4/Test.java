import java.util.Scanner;

// Base class
class Bicycle {
    private int numberOfGears;
    private int speed;

    // Constructor
    public Bicycle(int numberOfGears, int speed) {
        this.numberOfGears = numberOfGears;
        this.speed = speed;
    }

    // Getters
    public int getNumberOfGears() {
        return numberOfGears;
    }

    public int getSpeed() {
        return speed;
    }

    // toString() method
    public String toString() {
        return "Bicycle [Number of Gears: " + numberOfGears + ", Speed: " + speed + "]";
    }
}

// Derived class
class MontaneBike extends Bicycle {
    private int seatHeight;

    // Constructor
    public MontaneBike(int numberOfGears, int speed, int seatHeight) {
        super(numberOfGears, speed); // Call to superclass constructor
        this.seatHeight = seatHeight;
    }

    // Getter
    public int getSeatHeight() {
        return seatHeight;
    }

    // toString() method
    public String toString() {
        return super.toString() + ", Seat Height: " + seatHeight + "";
    }
}

// Test class
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of gears, speed, and seat height:");
        int numberOfGears = scanner.nextInt();
        int speed = scanner.nextInt();
        int seatHeight = scanner.nextInt();

        // Create an instance of MontaneBike
        MontaneBike montaneBike = new MontaneBike(numberOfGears, speed, seatHeight);

        // Display output
        System.out.println(montaneBike.toString());

        scanner.close();
    }
}
