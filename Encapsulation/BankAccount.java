package Encapsulation;

public class BankAccount {
    private double balance;  // 🔒 hidden data

    // public method to control access
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
