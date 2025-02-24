package aula20250224.entities;

public class Individual extends TaxPayer {
    private double healthExpend;

    public Individual(String name, double annualIncome, double healthExpend) {
        super(name, annualIncome);
        this.healthExpend = healthExpend; 
    }

    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public double getAnnualIncome() {
        return annualIncome;
    }

    public double getHealthExpend() {
        return healthExpend;
    }

    @Override
    public double getTax(){
        return (this.getAnnualIncome() < 20000) ? 0.15 * this.getAnnualIncome() : 
               (this.getHealthExpend() > 0) ? (0.25 * this.getAnnualIncome()) - (0.5 * this.getHealthExpend()) : (0.25 * this.getAnnualIncome());
    }
}
