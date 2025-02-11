import java.util.Scanner;  

class Vehicle {  
    protected String type;  

    // Constructor to initialize type  
    public Vehicle(String type) {  
        this.type = type;  
    }  

    // Method to display type  
    public void displayType() {  
        System.out.println("Vehicle Type: " + type);  
    }  
}

class Car extends Vehicle {  
    private String brand;  

    // Constructor to initialize type and brand  
    public Car(String type, String brand) {  
        super(type); // Call the constructor of the Vehicle class  
        this.brand = brand;  
    }  

    // Method to display brand  
    public void displayBrand() {  
        System.out.println("Car Brand: " + brand);  
    }  
}

public class main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Prompt user for type of vehicle  
        System.out.print("Enter the type of the vehicle: ");  
        String type = scanner.nextLine();  

        // Prompt user for brand of car  
        System.out.print("Enter the brand of the car: ");  
        String brand = scanner.nextLine();  

        // Create an instance of Car  
        Car myCar = new Car(type, brand);  

        // Display the type and brand of the car  
        myCar.displayType();  
        myCar.displayBrand();  

        // Close the scanner  
        scanner.close();  
    }  
}