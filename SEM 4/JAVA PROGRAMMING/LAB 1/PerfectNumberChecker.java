import java.util.Scanner;  

public class PerfectNumberChecker {  

    public static boolean isPerfectNumber(int n) {  
        if (n < 1) {  
            return false; 
        }  

        int properDivisorsSum = 0;  

        for (int i = 1; i <= n / 2; i++) {  
            if (n % i == 0) {  
                properDivisorsSum += i;  
            }  
        }  

        return properDivisorsSum == n;  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  

        if (isPerfectNumber(number)) {  
            System.out.println(number + " Perfect number");  
        } else {  
            System.out.println(number + " Not perfect number");  
        }  

        scanner.close();   
    }  
}