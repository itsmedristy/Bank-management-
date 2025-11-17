import java.util.ArrayList;
import java.util.Scanner;

// BankAccount class
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accNumber, double initialBalance) {
        this.accountHolder = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Compound interest
    public void calculateCompoundInterest(double rate, int years) {
        double newBalance = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Balance after " + years + " years at " + rate + "% rate: " + newBalance);
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

