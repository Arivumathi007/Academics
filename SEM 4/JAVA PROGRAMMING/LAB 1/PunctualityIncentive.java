import java.util.Scanner;

public class PunctualityIncentive{
    public static int calculatePunctualityIncentive (int initialIncentive, int N){
        int totalIncentive = 0;
        int currentIncentive = initialIncentive;

        for (int day = 0; day < N; day++){
            totalIncentive += currentIncentive;
            currentIncentive += 200;
        }

        return totalIncentive;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Incentive for Monday: ");
        int initialIncentive = scanner.nextInt();

        System.out.print("Enter the number of consecutive days: ");
        int N = scanner.nextInt();

        int totalPunctualityIncentive = calculatePunctualityIncentive(initialIncentive, N);
        System.out.println("The total punctuality incentive is: Rs. " + totalPunctualityIncentive);

        scanner.close();
    }
} 