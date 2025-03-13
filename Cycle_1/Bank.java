import java.util.Scanner;

class Account {                               //BankAccount class
    private String accountNumber;
    private String accountHolder;
    private double balance;

    Account(String accountNumber, String accountHolder, double balance) {   //constuctor for Account class
        this.accountNumber=accountNumber;                                  
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount) {                                    //method for deposit
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {                               //method for withdraw
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountInfo() {                                  //method for display
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class Bank {                                                    //Main class Bank
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNumber = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account ac = new Account(accNumber, accHolder, initialBalance);       //class object

        int choice;
        do {
            System.out.println("\nOptions");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();                                             //reading user's choice

            switch (choice) {                                                 //Give the result according to users choice
                case 1: 
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    ac.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    ac.withdraw(withdrawAmount);
                    break;
                case 3:
                    ac.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

    }
}
