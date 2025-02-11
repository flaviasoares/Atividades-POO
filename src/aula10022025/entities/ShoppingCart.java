package aula10022025.entities;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<String> productList = new ArrayList<String>();

    public ShoppingCart(int customerID, ArrayList<String> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    public void addProduct(String productName, double productPrice) {
        productList.add(productName, productPrice);
    }

    public void removeProduct() {
        //code
    }
    
    public String getContents() {
        return "alguma coisa"; // editar aqui
    }

    public int getCustomerID() {
        return 1; //editar aqui
    }

    public int getItemCount() {
        return 1; // editar aqui
    }

    public double getTotalPrice() {
        return 1.0; // editar aqui
    }
}
