package aula20250217.entities;

public abstract class TaxPayer {
    protected String name;
    protected double anualIncome;

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName(){
        return name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public abstract double getTax();

    @Override
    public abstract String toString();
}
