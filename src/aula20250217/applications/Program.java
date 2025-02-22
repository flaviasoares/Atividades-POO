package aula20250217.applications;

import java.util.Scanner;
import aula20250217.entities.Company;
import aula20250217.entities.Individual;
import aula20250217.entities.TaxPayer;
import aula20250217.entities.PayersList;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayersList taxPayers = new PayersList();

        System.out.println("Enter the number of tax payers: ");
        int numTaxPayers = scanner.nextInt();

        for (int i = 0; i < numTaxPayers; i++) {
            System.out.printf("Tax payer #%d data:\n", i + 1);
            System.out.println("Individual or company (i/c)? ");
            String typePayer = scanner.next().toLowerCase();

            System.out.println("Name: ");
            scanner.nextLine(); // isso me parece muito errado
            String name = scanner.next();

            System.out.println("Annual income: ");
            double annualIncome = scanner.nextDouble();

            TaxPayer taxPayer = null;
            if (typePayer.equals("i")) {
                System.out.println("Health expenditures: ");
                double healthExpend = scanner.nextDouble();
                taxPayer = new Individual(name, annualIncome, healthExpend);

            } else if (typePayer.equals("c")) {
                System.out.println("Number of employees: ");
                int numEmployees = scanner.nextInt();
                taxPayer = new Company(name, annualIncome, numEmployees);
            }

            taxPayers.addTaxPayer(taxPayer);
        }

        scanner.close();
        
        System.out.println("TAXES PAID:");
        System.out.println(taxPayers.getDetails());
        System.out.printf("TOTAL TAXES: %.2f", taxPayers.getTotalTaxes());
    }
}
