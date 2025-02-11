import java.util.Scanner;

class ItemType{
    private String name;
    private double deposit;
    private double costPerDay;

    public ItemType() {
    }

    public ItemType(String name, double deposit, double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDeposit(){
        return deposit;
    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    public double getCostPerDay(){
        return costPerDay;
    }
    
    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }
}

class ItemTypeBO {
    public void searchDetail (String search, ItemType[] items, int n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (items[i].getName().equalsIgnoreCase(search)) {
                System.out.printf("Name: %s\nDeposit: %.1f\nCost Per Day: %.1f\n",
                items[i].getName(), items[i].getDeposit(), items[i].getCostPerDay());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("item not found");
        }
    }

    public void display(ItemType[] items, int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("Name: %s\nDeposit: %.1f\nCost Per Day: %.1f\n",
            items[i].getName(), items[i].getDeposit(), items[i].getCostPerDay());
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemType[] items = new ItemType[10];
        int count = 0;
        ItemTypeBO itemTypeBO = new ItemTypeBO();

        while (true) {
            System.out.println("1. Add Item\n2. Search Item\n3. Display Items\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    if (count >= 10){
                        System.out.println("Array is full. Cannot add more items.");
                    } else {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter deposit: ");
                        double deposit = scanner.nextDouble();
                        System.out.print("Enter the cost per day: ");
                        double costPerDay = scanner.nextDouble();

                        items[count] = new ItemType(name, deposit, costPerDay);
                        count ++;
                        System.out.println("Item added successfully.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter the name of the item to be searched: ");
                    String searchName = scanner.nextLine();
                    itemTypeBO.searchDetail(searchName, items, count);
                    break;
                    
                case 3:
                    itemTypeBO.display(items, count);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");;
            }
            
        }
    }
}
