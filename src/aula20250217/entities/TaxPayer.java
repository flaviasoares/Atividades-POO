package aula20250217.entities;

public abstract class TaxPayer {
    protected String name;
    protected double annualIncome;

    public TaxPayer(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName(){
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public abstract double getTax();

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", this.getName(), getTax());
    }
}
