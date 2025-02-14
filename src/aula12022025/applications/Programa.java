package aula12022025.applications;

import java.util.ArrayList;
import java.util.Scanner;
import aula12022025.entities.Product;
import aula12022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productTypeID, quantityRemove;
        String productBrand, productType = "";
        double productPrice;
        int productSize;
        ArrayList<Product> productList = new ArrayList<Product>();
        
        System.out.println("Entre com a identificação do cliente:");
        int customerID = scanner.nextInt();
        ShoppingCart shoppingCart = new ShoppingCart(customerID, productList);

        boolean addProduct = true;
        int decisionAdd;
        // adicionar produtos no carrinho
        while (addProduct) {
            System.out.println("Escolha o tipo de produto:");
            System.out.printf("1. Refrigerador\n2. Forno\n3. TV\n4. Outro\n");
            productTypeID = scanner.nextInt();

            if (productTypeID == 1) { productType = "refrigerador"; }
            else if (productTypeID == 2) { productType = "forno"; } 
            else if (productTypeID == 3) { productType = "tv"; }
            else if (productTypeID == 4) {
                System.out.println("Digite o tipo de produto:");
                productType = scanner.next();  
            } 
            else { System.out.println("O valor digitado é inválido."); }

            System.out.printf("Digite a marca do(a) %s: ", productType);
            productBrand = scanner.next();
            System.out.printf("Digite o valor do(a) %s: ", productType);
            productPrice = scanner.nextDouble();
            System.out.printf("Digite o tamanho do(a) %s: ", productType);
            productSize = scanner.nextInt();

            shoppingCart.addProduct(productTypeID, productType, productBrand, productPrice, productSize);

            System.out.println("Deseja adicionar mais algum produto?");
            System.out.println("1. Sim\n2. Não");
            decisionAdd = scanner.nextInt();
            if (decisionAdd == 2) {
                addProduct = false;
            }
        }
        
        // listagem dos produtos no carrinho
        String productsPrint = shoppingCart.getContents();
        System.out.printf("Cliente ID: %d\n", customerID);
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
                System.out.println("Qual o tipo de produto que deseja remover?");
                productType = scanner.next();
                System.out.println("Quantos do mesmo produto deseja remover?");
                quantityRemove = scanner.nextInt();
                shoppingCart.removeProduct(productType, quantityRemove);
            } else {
                removeProduct = false;
            }

            // listagem dos produtos no carrinho
            productsPrint = shoppingCart.getContents();
            System.out.printf("Cliente ID: %d\n", customerID);
            System.out.printf("Lista de produtos:\n%s\n", productsPrint);
            
            // valor total dos produtos no carrinho
            totalPrice = shoppingCart.getTotalPrice();
            System.out.printf("O valor total da compra é %.2f\n", totalPrice);
        }

        scanner.close();
    }
}
