import java.util.Scanner;

abstract class AbstractClass {
    abstract int getValue();

    abstract int divisorSum(int n);
}

class Calculator extends AbstractClass {
    int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int value = calculator.getValue();

        int result = calculator.divisorSum(value);

        System.out.println("Sum of divisors of " + value + " is: " + result);
    }
}
