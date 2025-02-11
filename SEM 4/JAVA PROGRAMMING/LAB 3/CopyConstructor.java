import java.util.Scanner;  

class Person {  
    private String name;  
    private int age;  

    public Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    public Person(Person another) {  
        this.name = another.name;  
        this.age = another.age;  
    }  

    public void display() {  
        System.out.println("Name: " + name + ", Age: " + age);  
    }  
}  

public class CopyConstructor {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter name: ");  
        String name = scanner.nextLine();  

        System.out.print("Enter age: ");  
        int age = scanner.nextInt();  

        Person originalPerson = new Person(name, age);  
        System.out.println("Original Person:");  
        originalPerson.display();  

        Person copiedPerson = new Person(originalPerson);  
        System.out.println("Copied Person:");  
        copiedPerson.display();  

        scanner.close();  
    }  
}
