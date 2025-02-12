package aula12022025.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Product> auxList; // posso declarar assim?
    private Product product; // tem problema declarar assim?

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    public void addProduct(String productName, double productPrice) {
        product = new Product(productName, productPrice);
        productList.add(product);
    }

    public void removeProduct(String productName, int quantityRemove) {
        int quantityProduct = getItemCount(productName);
        if (quantityRemove == quantityProduct) {
            productList.removeIf(product -> product.getBrand().equals(productName));
        } else {
            int count = 0;
            Iterator<Product> it = productList.iterator();
            while (it.hasNext()) {
                if (it.next().getBrand().equals(productName)) {
                    it.remove();
                    count++;

                    if (count == quantityRemove) break;
                }
                else break;
            }
        }
    }
    
    public String getContents() {
        auxList = productList;
        return auxList.stream().map(product -> "Marca: " + product.getBrand() + ", Preço: " + product.getPrice()).collect(Collectors.joining("\n"));
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount(String productName) {
        auxList = productList;
        return (int) auxList.stream().filter(product -> product.getBrand().equals(productName)).count();
    }

    public double getTotalPrice() {
        auxList = productList;
        return auxList.stream().mapToDouble(Product::getPrice).sum();
    }
}
