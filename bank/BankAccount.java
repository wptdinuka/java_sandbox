

import java.util.Scanner;  // Import the Scanner class



class BankAccount extends BankingApplication {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;


    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if ( amount != 0 ) {
            balance = balance + amount;
            previousTransaction = amount;

        }
    }

    void withdraw(int amount) {
        if ( amount != 0 ) {
            balance = balance - amount;
            previousTransaction = -amount;

        }
    }

    void getPreviousTransactions() {
        if ( previousTransaction > 0) {
            System.out.println(previousTransaction + "- Deposited");
        } else if ( previousTransaction < 0) {
            System.out.println(previousTransaction + "- Withdrawn");
        } else {
            System.out.println("No Previous Transactions");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Customer  Id " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("**********************************************************");
            System.out.println("Enter an Option");
            System.out.println("**********************************************************");
            option = scanner.next().toUpperCase().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("****************************************************");
                    System.out.println("Balance = " +balance);
                    System.out.println("****************************************************");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("****************************************************");
                    System.out.println("Enter Amount to Deposit");
                    System.out.println("****************************************************");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("****************************************************");
                    System.out.println("Enter Amount to Withdraw");
                    System.out.println("****************************************************");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("****************************************************");
                    getPreviousTransactions();
                    System.out.println("****************************************************");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("*************Session Ended******************");
                    break;

                default:
                    System.out.println("Please enter a valid input");
                    break;

            }
        } while ( option != 'E' );
        System.out.println("Thank you for using the Bank");

    }

}