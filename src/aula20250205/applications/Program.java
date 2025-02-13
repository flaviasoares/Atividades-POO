package aula20250205.applications;

import java.util.Scanner;

import aula20250205.entities.Product;
import aula20250205.shared.PrintDataProduct;

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
        double totalValueInStock = product.totalValueInStock();

        System.out.println("Add unities of stock:");
        quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println(PrintDataProduct.print(name, quantity, totalValueInStock));

        System.out.println("Remove unities of stock:");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println(PrintDataProduct.print(name, quantity, totalValueInStock));
    
        scanner.close();
    }
}
