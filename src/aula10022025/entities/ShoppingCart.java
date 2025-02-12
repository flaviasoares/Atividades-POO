package aula10022025.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();
    ArrayList<Product> auxList;
    Product product;

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    // esse método está funcionando
    public void addProduct(String productName, double productPrice) {
        product = new Product(productName, productPrice);
        this.productList.add(product);
    }

    // public void removeProduct(String productName, int quantityRemove) {
    //     int quantityProduct = getItemCount(productName);
    //     if (quantityRemove == quantityProduct) {
    //         this.productList.removeIf(product -> product.getName().equals(productName));
    //     } else {
    //         int count = 0;
    //         while (count < 2) {
    //             if (this.productList(product).equals(productName) ) {
    //                 this.productList.remove(product);
    //                 count++;
    //             }
    //             else break;
    //         }
    //     }
    // }
    
    // esse método está funcionando
    public String getContents() {
        auxList = productList;
        return auxList.stream().map(product -> "Nome: " + product.getName() + ", Preço: " + product.getPrice()).collect(Collectors.joining("\n"));
    }

    // esse método está funcionando
    public int getCustomerID() {
        return customerID;
    }

    // esse método está funcionando
    public int getItemCount(String productName) {
        auxList = productList;
        return (int) auxList.stream().filter(product -> product.getName().equals(productName)).count();
    }

    // esse método está funcionando
    public double getTotalPrice() {
        auxList = productList;
        return auxList.stream().mapToDouble(Product::getPrice).sum();
    }
}
