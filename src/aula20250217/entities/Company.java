package aula20250217.entities;

public class Company extends TaxPayer {
    private int numEmployees;

    public Company(String name, double anualIncome, int numEmployees) {
        super(name, anualIncome);
        this.numEmployees = numEmployees;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getAnualIncome() {
        return anualIncome;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    @Override
    public double getTax(){
        int employees = this.getNumEmployees();
        double tax = 0;
        if (employees > 10) {
            tax = this.getAnualIncome() * 0.14;
        } else {
            tax = this.getAnualIncome() * 0.16;
        }
        return tax;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", this.getName(), this.getTax());
    }
}
