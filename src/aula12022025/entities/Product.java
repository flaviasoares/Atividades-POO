package aula12022025.entities;

public class Product {
    protected String type;
    protected String brand;
    protected double price;

    public Product(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}