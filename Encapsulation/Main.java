package Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println(acc.getBalance()); // ✅ Controlled access
        // acc.balance = -500; ❌ Not allowed (private)
    }
}
