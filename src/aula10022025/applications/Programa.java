package aula10022025.applications;

import java.util.Scanner;

import aula10022025.entities.ShoppingCart;

public class Programa {
    public static void main(String[] args) {
        int customerID;
        
        boolean adicionar = true;
        ShoppingCart shoppingcart;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a identificação do cliente:");
        customerID = scanner.nextInt();

        while (adicionar) {
            shoppingcart.addProduct(shoppingcart());
        }


    }
}
