package aula05022025.applications;

import java.util.Scanner;

import aula05022025.entities.Product;
import aula05022025.shared.PrintDataProduct;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product data:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Price:");
        double price = scanner.nextDouble();
        System.out.println("Quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Add unities of stock:");
        quantity = scanner.nextInt();
        product.addProducts(quantity);
        // System.out.println("");

        System.out.println("Remove unities of stock:");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        double totalValueInStock = product.totalValueInStock();
        PrintDataProduct printDataProduct = new PrintDataProduct(name, quantity, totalValueInStock);

        scanner.close();
    }
}
