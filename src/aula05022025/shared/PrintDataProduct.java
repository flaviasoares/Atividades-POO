package aula05022025.shared;

public class PrintDataProduct {
    String name;
    int quantity;
    double totalValueInStock;

    public PrintDataProduct(String name, int quantity, double totalValueInStock) {
        this.name = name;
        this.quantity = quantity;
        this.totalValueInStock = totalValueInStock;
    }

    public String printData() {
        return this.name + ", " + this.quantity.toString + " units, $" + this.totalValueInStock.toString();
    }
}
