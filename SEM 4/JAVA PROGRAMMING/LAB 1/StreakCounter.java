import java.util.Scanner;

public class StreakCounter {

    public static int streak(int n) {
        int k = 1;
        while ((n + k) % (k + 1) == 0) {
            k++;
        }
        return k;
    }

    public static int calculateP(int s, int N) {
        int count = 0;
        for (int n = 2; n < N; n++) {
            if (streak(n) == s) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of s: ");
        int s = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int result = calculateP(s, N);

        System.out.println("The count of integers n for which streak(n) = " + s + " is: " + result);

        scanner.close();
    }
}
