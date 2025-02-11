import java.util.Scanner;

class Employee {
    private int empId;
    private double salary;

    public Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }
}

class EmpLevel extends Employee {
    public EmpLevel(int empId, double salary) {
        super(empId, salary);
    }

    public String getLevel() {
        if (getSalary() > 100) {
            return "Level 1 (Top Management)";
        } else {
            return "Level 2 (Staff)";
        }
    }
}

public class EmployeeLevelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID and salary (separated by space): ");
        int empId = scanner.nextInt();
        double salary = scanner.nextDouble();

        EmpLevel employee = new EmpLevel(empId, salary);

        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Level: " + employee.getLevel());

        scanner.close();
    }
}