package aula12022025.entities;

public class Refrigerator extends Product{
    double volume; // Em litros

    public Refrigerator(String brand, double price, double volume) {
        super(brand, price);
        this.volume = volume;
    }
}
