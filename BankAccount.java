public class BankAccount {

    int balance = 1000;

    public void deposit(int amount) {

        balance = balance + amount;
        System.out.println("Deposit Successful");

    }

    public void withdraw(int amount) {

        if (amount <= balance) {

            balance = balance - amount;
            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Insufficient Balance");

        }

    }

    public void checkBalance() {

        System.out.println("Current Balance: " + balance);

    }

}