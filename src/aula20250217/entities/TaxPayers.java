package aula20250217.entities;

import java.util.ArrayList;

public class TaxPayers {
    private ArrayList<TaxPayer> taxPayersList = new ArrayList<TaxPayer>();

    public TaxPayers(ArrayList<TaxPayer> taxPayersList) {
        this.taxPayersList = taxPayersList;
    }

    public void addTaxPayer(TaxPayer taxPayer) {
        taxPayersList.add(taxPayer);
    }

    public String getDetails() {
        StringBuilder taxesList = new StringBuilder();
        for (TaxPayer taxPayer : taxPayersList) {
            taxesList.append(taxPayer.toString()).append("\n");
        }

        return taxesList.toString();
    }

    public double getTotalTaxes() {
        return taxPayersList.stream().mapToDouble(TaxPayer::getTax).sum();
    }
}
