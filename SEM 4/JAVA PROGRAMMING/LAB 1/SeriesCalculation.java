import java.util.Scanner;

public class SeriesCalculation {

    public static double calculateSeries(int n) {
        double seriesSum = 0.0;

        for (int k = 1; k <= n; k++) {
            seriesSum += (double) k / factorial(k);
        }

        return seriesSum;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double result = calculateSeries(n);
        System.out.printf("The result of the series up to %d is: %.6f\n", n, result);

        scanner.close();
    }
}
