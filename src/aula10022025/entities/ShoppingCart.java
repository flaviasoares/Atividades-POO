package aula10022025.entities;

import java.util.ArrayList;
import aula10022025.entities.Product;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();
    Product product;

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    public void addProduct(String productName, double productPrice) {
        product = new Product(productName, productPrice);
        this.productList.add(product);
    }

    public void removeProduct(String productName, int quantityRemove) {
        int quantityProduct = getItemCount(productName);
        if (quantityRemove == quantityProduct) {
            this.productList.removeIf(product -> product.getName().equals(productName));
        }

        else {}
    }
    
    // public String getContents() {
    //     return ; 
    // }

    // public int getCustomerID() {
    //     return 1; //editar aqui
    // }

    public int getItemCount(String productName) {
        return this.productList.stream().filter(product -> product.getName().equals(productName)).count();
    }

    // public double getTotalPrice() {
    //     return 1.0; // editar aqui
    // }
}
