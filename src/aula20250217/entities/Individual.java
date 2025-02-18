package aula20250217.entities;

public class Individual extends TaxPayer {
    private double healthExpend;

    public Individual(String name, double anualIncome, double healthExpend) {
        super(name, anualIncome);
        this.healthExpend = healthExpend; 
    }

    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public double getAnualIncome() {
        return anualIncome;
    }

    public double getHealthExpend() {
        return healthExpend;
    }

    @Override
    public double getTax(){
        double tax = 0;
        double income = this.getAnualIncome();
        double health = this.getHealthExpend();
        if (income < 20000) {
            tax = 0.15 * income;
        } else if (income >= 20000) {
            if (health > 0) {
                tax = (income * 0.25) - (health * 0.5);
            } else {
                tax = income * 0.25;
            }
        }
        return tax;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", this.getName(), this.getTax());
    }
}
