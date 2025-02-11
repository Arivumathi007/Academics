import java.util.Scanner;

class Account {
    private int accountNumber;
    private int accountBalance;

    public Account(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.accountBalance += amount;
        }
    }
}

class User extends Account {
    private String username;

    public User(String username, int accountNumber, int accountBalance) {
        super(accountNumber, accountBalance);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users;

        // Input the number of users
        System.out.print("Enter the number of users: ");
        int n = scanner.nextInt();
        users = new User[n];

        // Get details for each user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Enter initial deposit amount: ");
            int accountBalance = scanner.nextInt();

            users[i] = new User(username, accountNumber, accountBalance);
        }

        // Input the account number to check balance
        System.out.print("Enter the account number to check balance: ");
        int searchAccountNumber = scanner.nextInt();

        // Search for the account number
        for (int i = 0; i < n; i++) {
            if (users[i].getAccountNumber() == searchAccountNumber) {
                System.out.println("Account Balance: " + users[i].getAccountBalance());
                scanner.close();
                return;
            }
        }

        System.out.println("Account Number Does Not Exist.");
        scanner.close();
    }
}