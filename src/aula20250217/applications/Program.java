package aula20250217.applications;

import java.util.ArrayList;
import java.util.Scanner;
import aula20250217.entities.Company;
import aula20250217.entities.Individual;
import aula20250217.entities.TaxPayer;
import aula20250217.entities.PayersList;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TaxPayer> taxPayerList = new ArrayList<TaxPayer>();
        PayersList taxPayers = new PayersList(taxPayerList);

        int numTaxPayers, numEmployees;
        int count = 0;
        String typePayer, name, taxesPaid;
        double anualIncome, healthExpend; 

        System.out.println("Enter the number of tax payers: ");
        numTaxPayers = scanner.nextInt();

        while (count < numTaxPayers) {
            System.out.printf("Tax payer #%d data:\n", count + 1);

            System.out.println("Individual or company (i/c)? ");
            typePayer = scanner.next();

            System.out.println("Name: ");
            name = scanner.next();

            System.out.println("Anual income: ");
            anualIncome = scanner.nextDouble();

            if (typePayer.equals("i")) {
                System.out.println("Health expenditures: ");
                healthExpend = scanner.nextDouble();
                TaxPayer taxPayer = new Individual(name, anualIncome, healthExpend);
                taxPayers.addTaxPayer(taxPayer);

            } else if (typePayer.equals("c")) {
                System.out.println("Number of employees: ");
                numEmployees = scanner.nextInt();
                TaxPayer taxPayer = new Company(name, anualIncome, numEmployees);
                taxPayers.addTaxPayer(taxPayer);
            }

            count++;
        }

        scanner.close();
        
        taxesPaid = taxPayers.getDetails();
        System.out.println("TAXES PAID:");
        System.out.println(taxesPaid);

        double totalTaxes = taxPayers.getTotalTaxes();

        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);
    }
}
