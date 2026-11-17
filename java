
class BankAccount {


    int accountNumber;
    String accountHolderName;
    double balance;


    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }


    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}


public class Main {

    public static void main(String[] args) {


        BankAccount account1 =
                new BankAccount(101, "Rahul", 5000);

        BankAccount account2 =
                new BankAccount(102, "Aman", 8000);


        System.out.println("===== Account 1 Operations =====");
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.checkBalance();


        System.out.println("\n===== Account 2 Operations =====");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();


        System.out.println("\n===== Final Account Details =====");

        account1.displayDetails();
        account2.displayDetails();
    }
}
