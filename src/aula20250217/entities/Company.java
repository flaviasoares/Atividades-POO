package aula20250217.entities;

public class Company extends TaxPayer {
    private int numEmployees;

    public Company(String name, double annualIncome, int numEmployees) {
        super(name, annualIncome);
        this.numEmployees = numEmployees;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getAnnualIncome() {
        return annualIncome;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    @Override
    public double getTax(){
        return this.getAnnualIncome() * (this.getNumEmployees() > 10 ? 0.14 : 0.16);
    }
}
