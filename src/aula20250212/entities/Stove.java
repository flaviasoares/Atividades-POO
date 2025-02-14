package aula20250212.entities;

public class Stove extends Product {
    private int burners;

    public Stove(String type, String brand, double price, int burners) {
        super(type, brand, price);
        this.burners = burners;
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

    public int getBurners() {
        return burners;
    }
}