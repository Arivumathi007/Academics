import java.util.Scanner;

class Occurrence {
    public int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to find its occurrences: ");
        char inputChar = scanner.next().charAt(0);

        Occurrence occurrence = new Occurrence();

        int result = occurrence.count(inputString, inputChar);
        System.out.println("The character '" + inputChar + "' appears " + result + " time(s) in the string.");

        scanner.close();
    }
}
