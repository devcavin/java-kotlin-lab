package javalab.methods;

import java.util.Scanner;

public class BankSimulator {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int options;
        boolean isRunning = true;

        System.out.println("Hey there! Welcome to Java Bank.");
        System.out.println("Please below are our services");

        while (isRunning) {
            System.out.println("\nServices");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            options = input.nextInt();
            input.nextLine();

            switch (options) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    deposit(amount);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    withdraw(amount);
                }
                case 3 -> checkBalance();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid option");
            }
        }
        System.out.println("Thank you for banking with us. We'd like to wish you lovely moments, until next time. " +
                "Bye!");
    }

    public static void deposit(double  amount) {
        if (amount <= 0) {
            System.out.println("Dear customer, amount must be greater than 0");
            return;
        }
        balance += amount;
    }

    public static void withdraw(double  amount) {
        if (amount <= 0) {
            System.out.println("Dear customer, amount must be greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Dear customer, you have insufficient balance to complete this transaction");
            return;
        }
        balance -= amount;
    }

    public static void checkBalance() {
        System.out.println("Your balance is " + balance);
    }
}
