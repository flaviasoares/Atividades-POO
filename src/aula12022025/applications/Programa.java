package aula12022025.applications;

import java.util.ArrayList;
import java.util.Scanner;
import aula12022025.entities.Product;
import aula12022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productTypeID, quantityRemove;
        String productBrand, productType;
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
            System.out.printf("1. Refrigerador\n2. Forno\n3. TV\n4. Outro");
            productTypeID = scanner.nextInt();
            if (productTypeID == 1) {
                System.out.println("Digite a marca do refrigerador:");
                productBrand = scanner.next();
                System.out.println("Digite o valor do refrigerador:");
                productPrice = scanner.nextDouble();
                System.out.println("Digite o tamanho do refrigerador:");
                productSize = scanner.nextInt();

                shoppingCart.addProduct(productTypeID, "Refrigerador", productBrand, productPrice, productSize);

                System.out.println("Deseja adicionar mais algum produto?");
                System.out.println("1. Sim\n2. Não");
                decisionAdd = scanner.nextInt();

                if (decisionAdd == 2) {
                    addProduct = false;
                }

            } else if (productTypeID == 2) {
                System.out.println("Digite a marca do forno:");
                productBrand = scanner.next();
                System.out.println("Digite o valor do forno:");
                productPrice = scanner.nextDouble();
                System.out.println("Digite o tamanho do forno:");
                productSize = scanner.nextInt();
                shoppingCart.addProduct(productTypeID, "Forno", productBrand, productPrice, productSize);

                System.out.println("Deseja adicionar mais algum produto?");
                System.out.println("1. Sim\n2. Não");
                decisionAdd = scanner.nextInt();

                if (decisionAdd == 2) {
                    addProduct = false;
                }
                
            } else if (productTypeID == 3) {
                System.out.println("Digite a marca da TV:");
                productBrand = scanner.next();
                System.out.println("Digite o valor da TV:");
                productPrice = scanner.nextDouble();
                System.out.println("Digite o tamanho da TV:");
                productSize = scanner.nextInt();
                shoppingCart.addProduct(productTypeID, "TV", productBrand, productPrice, productSize);

                System.out.println("Deseja adicionar mais algum produto?");
                System.out.println("1. Sim\n2. Não");
                decisionAdd = scanner.nextInt();

                if (decisionAdd == 2) {
                    addProduct = false;
                }
                
            } else if (productTypeID == 4) {
                System.out.println("Digite o tipo do produto:");
                productType = scanner.next();
                System.out.println("Digite a marca do produto:");
                productBrand = scanner.next();
                System.out.println("Digite o valor do produto:");
                productPrice = scanner.nextDouble();

                shoppingCart.addProduct(productTypeID, productType, productBrand, productPrice, 0);

                System.out.println("Deseja adicionar mais algum produto?");
                System.out.println("1. Sim\n2. Não");
                decisionAdd = scanner.nextInt();

                if (decisionAdd == 2) {
                    addProduct = false;
                }
                
            } else {
                System.out.println("O valor digitado é inválido.");
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
