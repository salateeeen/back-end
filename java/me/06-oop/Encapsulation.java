class BankAccount {
    // cant access from anywhere instead this class
    private double balance;

    // avoid anyone to access balance from outside this functions
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);

        System.out.println(account.getBalance());
    }
}
