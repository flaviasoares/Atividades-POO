package aula10022025.entities;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(String name) {
        return this.name; // editar aqui
    }

    public double getPrice(double price) {
        return this.price; // editar aqui
    }
}
