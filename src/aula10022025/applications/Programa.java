package aula10022025.applications;

import java.util.ArrayList;
import java.util.Scanner;

import aula10022025.entities.Product;
import aula10022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        // entities 
        Product product;
        ShoppingCart shoppingCart;

        Scanner scanner = new Scanner(System.in);
        int customerID;
        String nameProduct;
        double priceProduct;
        ArrayList<Product> productList = new ArrayList<Product>();


        System.out.println("Entre com a identificação do cliente:");
        customerID = scanner.nextInt();

        boolean addProduct = true;
        int decision;

        while (addProduct) {
            System.out.println("Digite o nome do produto:");
            nameProduct = scanner.nextLine();
            System.out.println("Digite o valor do produto:");
            priceProduct = scanner.nextDouble();

            product = new Product(nameProduct, priceProduct);
            productList.add(product);

            System.out.println("Deseja adicionar mais algum produto?");
            System.out.println("1. Sim\n2. Não\n");
            decision = scanner.nextInt();

            if (decision == 2) {
                addProduct = false;
                scanner.close();
            }
        }

        shoppingCart = new ShoppingCart(customerID, productList);
        System.out.println(shoppingCart);
    }
}
