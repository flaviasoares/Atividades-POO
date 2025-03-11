package aula20250226.problem2.applications;

import java.util.Scanner;
import aula20250226.problem2.entities.Account;
import aula20250226.problem2.entities.exceptions.BankException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            
            Account account = new Account(number, holder, balance, withdrawLimit);
            
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (BankException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
