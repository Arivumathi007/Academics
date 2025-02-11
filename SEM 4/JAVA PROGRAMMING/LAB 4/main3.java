import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Staff extends Person {
    private int staffId;

    public Staff(String name, int staffId) {
        super(name);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void displayStaff() {
        super.display();
        System.out.println("Staff ID: " + staffId);
    }
}

class TemporaryStaff extends Staff {
    private int days;
    private int hoursWorked;
    private static final int SALARY_PER_HOUR = 50;

    public TemporaryStaff(String name, int staffId, int days, int hoursWorked) {
        super(name, staffId);
        this.days = days;
        this.hoursWorked = hoursWorked;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int calculateSalary() {
        return days * hoursWorked * SALARY_PER_HOUR;
    }

    public void displayTemporaryStaff() {
        super.displayStaff();
        System.out.println("Days Worked: " + days);
        System.out.println("Hours Worked per Day: " + hoursWorked);
        System.out.println("Salary: Rs." + calculateSalary());
    }
}

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Staff ID: ");
        int staffId = scanner.nextInt();

        System.out.print("Enter number of days worked: ");
        int days = scanner.nextInt();

        System.out.print("Enter hours worked per day: ");
        int hoursWorked = scanner.nextInt();

        TemporaryStaff tempStaff = new TemporaryStaff(name, staffId, days, hoursWorked);
        tempStaff.displayTemporaryStaff();

        scanner.close();
    }
}