import java.util.Scanner;

class Prof {
    int id;
    String name;
    String dept;
    int age;
    double salary;

    public Prof(int id, String name, String dept, int age, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.salary = salary;
    }
}

public class Main1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of professors: ");
        int n = scanner.nextInt();
        Prof[] professors = new Prof[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for professor " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            professors[i] = new Prof(id, name, dept, age, salary);
        }

        Prof highestSalaryProf = professors[0];
        for (int i = 1; i < professors.length; i++) {
            if (professors[i].salary > highestSalaryProf.salary) {
                highestSalaryProf = professors[i];
            }
        }

        System.out.println("\nProfessor with the highest salary:");
        System.out.println("ID: " + highestSalaryProf.id);
        System.out.println("Name: " + highestSalaryProf.name);
        System.out.println("Department: " + highestSalaryProf.dept);
        System.out.println("Age: " + highestSalaryProf.age);
        System.out.println("Salary: " + highestSalaryProf.salary);

        scanner.close();
    }
}
