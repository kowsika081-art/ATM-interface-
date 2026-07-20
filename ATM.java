import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);
    BankAccount account = new BankAccount();

    public void start() {

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Deposit Amount: ");
                int amount = sc.nextInt();

                account.deposit(amount);

            }

            else if (choice == 2) {

                System.out.print("Enter Withdraw Amount: ");
                int amount = sc.nextInt();

                account.withdraw(amount);

            }

            else if (choice == 3) {

                account.checkBalance();

            }

            else if (choice == 4) {

                System.out.println("Thank You!");

            }

            else {

                System.out.println("Invalid Choice");

            }

        } while (choice != 4);

    }

}