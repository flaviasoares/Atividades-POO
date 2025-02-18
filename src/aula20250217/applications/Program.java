package aula20250217.applications;

import java.util.ArrayList;
import java.util.Scanner;
import aula20250217.entities.Company;
import aula20250217.entities.Individual;
import aula20250217.entities.TaxPayer;
import aula20250217.entities.TaxPayers;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TaxPayer> taxPayerList = new ArrayList<TaxPayer>();
        TaxPayers taxPayers = new TaxPayers(taxPayerList);

        int numTaxPayers, numEmployees;
        String typePayer, name;
        double anualIncome, healthExpend; 

        System.out.println("Enter the number of tax payers: ");
        numTaxPayers = scanner.nextInt();
        int count = 0, aux = 0;

        while (count < numTaxPayers) {
            aux = count + 1;
            System.out.printf("Tax payer #%d data:\n", aux);

            System.out.println("Individual or company (i/c)? ");
            typePayer = scanner.next();

            System.out.println("Name: ");
            name = scanner.next();

            System.out.println("Anual income: ");
            anualIncome = scanner.nextDouble();

            if (typePayer.equals("i")) {
                System.out.println("Health expenditures: ");
                healthExpend = scanner.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpend);
                TaxPayer taxPayer = individual;
                taxPayers.addTaxPayer(taxPayer);
            } else if (typePayer.equals("c")) {
                System.out.println("Number of employees: ");
                numEmployees = scanner.nextInt();
                Company company = new Company(name, anualIncome, numEmployees);
                TaxPayer taxPayer = company;
                taxPayers.addTaxPayer(taxPayer);
            }

            count++;
        }

        scanner.close();
        
        String taxesPaid = taxPayers.getDetails();
        System.out.println("TAXES PAID:");
        System.out.println(taxesPaid);

        double totalTaxes = taxPayers.getTotalTaxes();

        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);
    }
}
