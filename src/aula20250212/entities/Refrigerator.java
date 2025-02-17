package aula20250212.entities;

public class Refrigerator extends Product{
    private int size;

    public Refrigerator(String type, String brand, double price, int size) {
        super(type, brand, price);
        this.size = size;
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

    public int getSize() {
        return size;
    }

    // @Override
    // public double getTax() {
    //     return something;
    // }

    // @Override
    // public double getPriceWithTax() {
    //     return price + this.getTax();
    // }

    @Override
    public double toString() {
        return "Tipo: " + this.getType() + "Marca: " + this.getBrand() + "Preço: " + this.getPrice() + "Capacidade: " + this.getSize();
    }
}