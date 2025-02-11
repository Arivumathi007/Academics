import java.util.Scanner;

public class Overloading {
    private String name;
    private String day;
    private int temp;

    public Overloading() {
        this.name = "Argentina";
        this.day = "";
        this.temp = 29;
        System.out.println("Default Constructor called: " + name + ", " + day + ", " + temp);
    }

    public Overloading(String name, int temp) {
        this.name = name;
        this.day = "";
        this.temp = temp;
        System.out.println("Parameterized Constructor 1 called: " + name + ", " + day + ", " + temp);
    }

    public Overloading(String name, String day, int temp) {
        this.name = name;
        this.day = day;
        this.temp = temp;
        System.out.println("Parameterized Constructor 2 called: " + name + ", " + day + ", " + temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Overloading obj1 = new Overloading();

        System.out.println("Enter name and temperature for Parameterized Constructor 1:");
        String name1 = scanner.nextLine();
        int temp1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Overloading obj2 = new Overloading(name1, temp1);

        System.out.println("Enter name, day, and temperature for Parameterized Constructor 2:");
        String name2 = scanner.nextLine();
        String day2 = scanner.nextLine();
        int temp2 = scanner.nextInt();
        Overloading obj3 = new Overloading(name2, day2, temp2);

        scanner.close();
    }
}
