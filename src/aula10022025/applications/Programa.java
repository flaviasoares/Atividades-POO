package aula10022025.applications;

import java.util.ArrayList;
import java.util.Scanner;

import aula10022025.entities.Product;
import aula10022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerID, quantityRemove;
        String nameProduct;
        double priceProduct;
        ArrayList<Product> productList = new ArrayList<Product>();
        
        System.out.println("Entre com a identificação do cliente:");
        customerID = scanner.nextInt();
        ShoppingCart shoppingCart = new ShoppingCart(customerID, productList);

        boolean addProduct = true, removeProduct = true;
        int decisionAdd, decisionRemove;

        while (addProduct) {
            System.out.println("Digite o nome do produto:");
            nameProduct = scanner.next();
            System.out.println("Digite o valor do produto:");
            priceProduct = scanner.nextDouble();

            shoppingCart.addProduct(nameProduct, priceProduct);

            System.out.println("Deseja adicionar mais algum produto?");
            System.out.println("1. Sim\n2. Não\n");
            decisionAdd = scanner.nextInt();

            if (decisionAdd == 2) {
                addProduct = false;
            }
        }

        System.out.println("Deseja remover algum produto?");
        System.out.println("1. Sim\n2. Não\n");
        decisionRemove = scanner.nextInt();
        if (decisionRemove == 1) {
            System.out.println("Qual produto deseja remover?");
            nameProduct = scanner.next();
            System.out.println("Quantos do mesmo produto deseja remover?");
            quantityRemove = scanner.nextInt();
            shoppingCart.removeProduct(nameProduct, quantityRemove);
        }

        scanner.close();

        shoppingCart = new ShoppingCart(customerID, productList);
        System.out.println(shoppingCart);
    }
}
