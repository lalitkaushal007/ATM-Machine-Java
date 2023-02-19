package Lks_Java;

import java.util.Scanner;

public class lks004 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Set account balance and PIN
            double balance = 1000.0;
            int pin = 1234;

            // Prompt user for PIN
            System.out.println("Please enter your PIN: ");
            int enteredPin = scanner.nextInt();

            // Check if PIN is correct
            if (enteredPin == pin) {
                // Display menu
                System.out.println("Welcome to the ATM.");
                System.out.println("1. Check balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");

                // Prompt user for choice
                System.out.println("Please enter your choice: ");
                int choice = scanner.nextInt();

                // Handle user choice
                switch (choice) {
                    case 1:
                        System.out.println("Your balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much would you like to withdraw? ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient funds.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Your new balance is " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("How much would you like to deposit? ");
                        double depositAmount = scanner.nextDouble();
                        balance += depositAmount;
                        System.out.println("Your new balance is " + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid PIN.");
            }
        }
    }
}
