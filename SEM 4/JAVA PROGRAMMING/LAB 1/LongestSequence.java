import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);

        int maxLength = 0;
        int currentLength = 0;

        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                currentLength++; 
                maxLength = Math.max(maxLength, currentLength); 
            } else {
                currentLength = 0; 
            }
        }

        System.out.println("Binary representation: " + binary);
        System.out.println("Length of longest sequence of 0's: " + maxLength);

        scanner.close();
    }
}
