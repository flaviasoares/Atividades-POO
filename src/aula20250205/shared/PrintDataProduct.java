package aula20250205.shared;

public class PrintDataProduct {
    public static String print(String name, int quantity, double totalValueInStock) {
        return name + ", " + Integer.toString(quantity) + " units, $" + Double.toString(totalValueInStock);
    }
}
