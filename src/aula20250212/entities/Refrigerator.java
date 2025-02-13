package aula20250212.entities;

public class Refrigerator extends Product{
    private int size;

    public Refrigerator(int typeID, String type, String brand, double price, int size) {
        super(typeID, type, brand, price);
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
}
