package ATMMachine;     // Package Declaration

import java.util.Scanner;   // Importing files

class ATM {
    private float balance = 0;  // Initialized to 0
    private final int PIN = 5674;

    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    private void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    private void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Money withdrawn successfully");
        }
    }

    private void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Amount deposited successfully");
    }
}

class AtMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();  // Start the process by checking the PIN
    }
}
