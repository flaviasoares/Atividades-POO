package aula10022025.applications;

import java.util.ArrayList;
import java.util.Scanner;
import aula10022025.entities.Product;
import aula10022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityRemove;
        String nameProduct;
        double priceProduct;
        ArrayList<Product> productList = new ArrayList<Product>();
        
        System.out.println("Entre com a identificação do cliente:");
        int customerID = scanner.nextInt();
        ShoppingCart shoppingCart = new ShoppingCart(customerID, productList);

        boolean addProduct = true;
        int decisionAdd;
        // adicionar produtos no carrinho
        while (addProduct) {
            System.out.println("Digite o nome do produto:");
            nameProduct = scanner.next();
            System.out.println("Digite o valor do produto:");
            priceProduct = scanner.nextDouble();

            shoppingCart.addProduct(nameProduct, priceProduct);

            System.out.println("Deseja adicionar mais algum produto?");
            System.out.println("1. Sim\n2. Não");
            decisionAdd = scanner.nextInt();

            if (decisionAdd == 2) {
                addProduct = false;
            }
        }
        
        // listagem dos produtos no carrinho
        String productsPrint = shoppingCart.getContents();
        System.out.printf("Lista de produtos:\n%s\n", productsPrint);
        
        // valor total dos produtos no carrinho
        double totalPrice = shoppingCart.getTotalPrice();
        System.out.printf("O valor total da compra é %.2f\n", totalPrice);

        boolean removeProduct = true;
        int decisionRemove;
        // remover produtos do carrinho
        while (removeProduct) {
            System.out.println("Deseja remover algum produto?");
            System.out.println("1. Sim\n2. Não");
            decisionRemove = scanner.nextInt();

            if (decisionRemove == 1) {
                System.out.println("Qual o nome do produto que deseja remover?");
                nameProduct = scanner.next();
                System.out.println("Quantos do mesmo produto deseja remover?");
                quantityRemove = scanner.nextInt();
                shoppingCart.removeProduct(nameProduct, quantityRemove);
            } else {
                removeProduct = false;
            }
        }

        scanner.close();

        // listagem dos produtos no carrinho
        productsPrint = shoppingCart.getContents();
        System.out.printf("Lista de produtos:\n%s\n", productsPrint);
        
        // valor total dos produtos no carrinho
        totalPrice = shoppingCart.getTotalPrice();
        System.out.printf("O valor total da compra é %.2f\n", totalPrice);
    }
}
