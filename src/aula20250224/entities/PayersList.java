package aula20250224.entities;

import java.util.ArrayList;

public class PayersList {
    private ArrayList<TaxPayer> taxPayersList;

    public PayersList() {
        this.taxPayersList = new ArrayList<>();
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
