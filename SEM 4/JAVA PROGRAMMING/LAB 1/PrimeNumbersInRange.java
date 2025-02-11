import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        if (end <= start){
            System.out.println("The second number must be greater than the first number");
            return;
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":" );
        for (int number = start; number <= end; number++){
            if (isPrime(number)){
                System.out.println(number);
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;

            }
        }
        return true;
    }
}