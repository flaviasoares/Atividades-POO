package aula12022025.entities;

public class TV extends Product {
    int inches;

    public TV(int typeID, String type, String brand, double price, int inches) {
        super(typeID, type, brand, price);
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
}
