

import java.util.Scanner;

class Bank {
    private double balance;
    private String holderName;
    public String accountNumber;

    public Bank(double balance, String holderName, String accountNumber) {
        this.holderName = holderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return holderName;
    }

    public void setName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount !!");
        }
        balance += amount;
        System.out.println("This is the new balance after deposit  " + balance);

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount !!");
        } else if (amount < balance) {
            System.out.println("Insufficient balance !!");
        } else {
            System.out.println("The amount is withdrwal from your account" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("This is your current blance : " + balance);
    }

}
class ATM {

    Bank bank;

    Scanner sc = new Scanner(System.in);
    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void menu() {
        System.out.println("1 : Deposit");
        System.out.println("2 : WithDrawal");
        System.out.println("3 : Check balance");
        System.out.println("4 : Exit ");
    }

    public void run() {
        menu();
        int choice;
        System.out.println("Enter your choice :");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                handledeposite();
                break;
            case 2:
                handleWithdrawal();
                break;
            case 3:
                handleBalnce();
                break;
            case 4:
                System.out.println("Thanks for using ATM");
                break;
            default:
                System.out.println("Invalid try again");
        }

    }
    public void handledeposite() {
        System.out.println("Enter the amount to deposite");
        double amount = sc.nextDouble();
        bank.deposit(amount);
    }

    public void handleWithdrawal() {
        System.out.println("Enter the amount for withdrawal");
        double amount = sc.nextDouble();
        bank.withdraw(amount);
        sc.close();
    }
    

    public void handleBalnce() {
        bank.checkBalance();
    }
    

}

public class ATMBank {
    public static void main(String[] args) {
        Bank b = new Bank(5000, "Mayank Mishra", "BOB11110");
        ATM a = new ATM(b);
        a.run();

    }
}
