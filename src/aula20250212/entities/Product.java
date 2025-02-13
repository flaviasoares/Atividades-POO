package aula20250212.entities;

public class Product {
    protected int typeID;
    protected String brand;
    protected double price;
    protected String type;

    public Product(int typeID, String type, String brand, double price) {
        this.typeID = typeID;
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