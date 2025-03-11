package aula20250226.problem2.entities;

import aula20250226.problem2.entities.exceptions.BankException;

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

    public void withdraw(double amount) throws BankException {
        BankException.validateWithdraw(amount, balance, withdrawLimit);
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
