import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the person in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter the height of the person in meters: ");
        double height = scanner.nextDouble();

        double BMI = calculateBMI(weight, height);

        System.out.printf("Your BMI is: %.2f\n", BMI);
        System.out.println(getBMICategory(BMI));

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory (double BMI) {
        if (BMI < 18.5){
            return ("You are underweight");
        } else if (BMI >= 18.5 && BMI < 25.0){
            return ("You have a normal weight");
        } else if (BMI >= 25.0 && BMI < 30.0){
            return ("You have a heavy weight");
        } else{
            return ("You are overweight");
        }
    }
}