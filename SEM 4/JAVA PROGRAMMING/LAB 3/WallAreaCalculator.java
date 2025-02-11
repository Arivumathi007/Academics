import java.util.Scanner;  

class Wall {  
    private double length;  
    private double height;  

    public Wall(double length, double height) {  
        this.length = length;  
        this.height = height;  
    }  

    public double calculateArea() {  
        return length * height;  
    }  
}  

public class WallAreaCalculator {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter the length of the first wall: ");  
        double length1 = scanner.nextDouble();  
        System.out.print("Enter the height of the first wall: ");  
        double height1 = scanner.nextDouble();  
        
        Wall wall1 = new Wall(length1, height1);  
        double area1 = wall1.calculateArea();  
        System.out.println("The area of the first wall is: " + area1);  

        System.out.print("Enter the length of the second wall: ");  
        double length2 = scanner.nextDouble();  
        System.out.print("Enter the height of the second wall: ");  
        double height2 = scanner.nextDouble();  
        
        Wall wall2 = new Wall(length2, height2);  
        double area2 = wall2.calculateArea();  
        System.out.println("The area of the second wall is: " + area2);  

        scanner.close();  
    }  
}