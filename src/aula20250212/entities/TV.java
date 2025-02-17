package aula20250212.entities;

public class TV extends Product {
    int inches;

    public TV(String type, String brand, double price, int inches) {
        super(type, brand, price);
        this.inches = inches;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public double toString() {
        return "Tipo: " + this.getType() + "Marca: " + this.getBrand() + "Preço: " + this.getPrice() + "Polegadas: " + this.getInches();
    }
}