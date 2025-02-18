package aula20250212.entities;

public abstract class Product {
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

    public abstract double getTax();

    public double getPriceWithTax() {
        return price + getTax();
    }

    @Override
    public String toString() {
        return "Tipo: " + this.getType() + "Marca: " + this.getBrand() + "Preço: " + this.getPrice();
    }
}