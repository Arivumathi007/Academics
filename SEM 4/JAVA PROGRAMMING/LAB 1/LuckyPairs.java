import java.util.Scanner;

public class LuckyPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Richie's initial number (A): ");
        int A = scanner.nextInt();

        System.out.print("Enter Riya's initial number (B): ");
        int B = scanner.nextInt();

        System.out.print("Enter the total number of turns (N): ");
        int N = scanner.nextInt();

        int C = A; 
        int D = B; 

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) { 
                C *= 2;
            } else { 
                D *= 2;
            }
        }

        int finalScore = C + D;

        System.out.println("After " + N + " turns:");
        System.out.println("Richie's number (C): " + C);
        System.out.println("Riya's number (D): " + D);
        System.out.println("Final score (C + D): " + finalScore);

        scanner.close();
    }
}