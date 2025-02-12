package aula12022025.entities;

public class TV extends Product {
    double inches;

    public TV(String brand, double price, double inches) {
        super(brand, price);
        this.inches = inches;
    }
}
