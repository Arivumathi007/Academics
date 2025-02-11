import java.util.Scanner;

class StallCategory {
    public String name;
    public String detail;

    public StallCategory() {
        this.name = "Default Name";
        this.detail = "Default Detail";
    }

    public StallCategory(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public StallCategory(StallCategory object) {
        this.name = object.name;
        this.detail = object.detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

public class Main1 {
    public static void main(String[] args) {
        StallCategory defaultStall = new StallCategory();

        System.out.println("Using Default Constructor:");
        System.out.println("Name: " + defaultStall.getName());
        System.out.println("Detail: " + defaultStall.getDetail());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stall Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Stall Detail:");
        String detail = scanner.nextLine();

        StallCategory parameterizedStall = new StallCategory(name, detail);

        System.out.println("\nUsing Parameterized Constructor:");
        System.out.println("Name: " + parameterizedStall.getName());
        System.out.println("Detail: " + parameterizedStall.getDetail());

        StallCategory copiedStall = new StallCategory(parameterizedStall);

        System.out.println("\nUsing Copy Constructor:");
        System.out.println("Name: " + copiedStall.getName());
        System.out.println("Detail: " + copiedStall.getDetail());

        scanner.close();
    }
}
