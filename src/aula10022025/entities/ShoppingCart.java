package aula10022025.entities;

import java.util.ArrayList;
import aula10022025.entities.Product;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    // public void addProduct(String productName, double productPrice) {
    //     // Product product = new Product();
    //     // productList.add(product);
    // }

    // public void removeProduct() {
    //     //code
    // }
    
    // public String getContents() {
    //     return "alguma coisa"; // editar aqui
    // }

    // public int getCustomerID() {
    //     return 1; //editar aqui
    // }

    // public int getItemCount() {
    //     return 1; // editar aqui
    // }

    // public double getTotalPrice() {
    //     return 1.0; // editar aqui
    // }
}
