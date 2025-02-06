package aula05022025.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addProducts(int quantity) {
        this.quantity = this.quantity + quantity; // ou this.quantity += quantity
    }

    public void removeProducts(int quantity) {
        this.quantity = this.quantity - quantity; // ou this.quantity -= quantity
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }
}
