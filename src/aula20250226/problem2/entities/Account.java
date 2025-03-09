package aula20250226.problem2.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
