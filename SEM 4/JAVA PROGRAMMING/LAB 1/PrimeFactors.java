import java.util.Scanner;  

public class PrimeFactors {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        
        System.out.print("Prime factors: ");  
        printPrimeFactors(number);  
        
        scanner.close();  
    }  

    public static void printPrimeFactors(int num) {  
        while (num % 2 == 0) {  
            System.out.print(2 + " ");  
            num /= 2;  
        }  

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {  
                System.out.print(i + " ");  
                num /= i;  
            }  
        }  

        if (num > 2) {  
            System.out.print(num + " ");  
        }  
    }  
}