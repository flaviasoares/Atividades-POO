package aula20250226.problem2.entities.exceptions;

public class BankException extends Exception {
    public BankException(String message){
        super(message);
    }

    public static void validateWithdraw(double amount, double balance, double withdrawLimit) throws BankException {
        if (amount > withdrawLimit) {
            throw new BankException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new BankException("Withdraw error: Not enough balance");
        }
    }
}
