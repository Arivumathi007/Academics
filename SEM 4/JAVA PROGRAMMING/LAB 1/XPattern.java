import java.util.Scanner;

public class XPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string of odd length: ");
        String input = scanner.nextLine();
        
        if (input.length() % 2 == 1) {
            pattern(input);
        } else {
            System.out.println("Please enter a string with an odd length.");
        }

        scanner.close();
    }

    public static void pattern(String str) {
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
