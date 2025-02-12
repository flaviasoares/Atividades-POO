package aula10022025.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();
    private ArrayList<Product> auxList; // posso declarar assim?
    Product product; // tem problema declarar assim?

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    // esse método está funcionando
    public void addProduct(String productName, double productPrice) {
        product = new Product(productName, productPrice);
        this.productList.add(product); // o uso so this. aqui é dispensável?
    }

    public void removeProduct(String productName, int quantityRemove) {
        int quantityProduct = getItemCount(productName);
        if (quantityRemove == quantityProduct) {
            this.productList.removeIf(product -> product.getName().equals(productName));
        } else {
            int count = 0;
            Iterator<Product> it = this.productList.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(productName)) {
                    it.remove();
                    count++;

                    if (count == quantityRemove) break;
                }
                else break;
            }
        }
    }
    
    public String getContents() {
        auxList = productList; // estou usando essa variável porque não entendi bem o que .stream faz com a lista
        return auxList.stream().map(product -> "Nome: " + product.getName() + ", Preço: " + product.getPrice()).collect(Collectors.joining("\n"));
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount(String productName) {
        auxList = productList; // estou usando essa variável porque não entendi bem o que .stream faz com a lista
        return (int) auxList.stream().filter(product -> product.getName().equals(productName)).count();
    }

    public double getTotalPrice() {
        auxList = productList; // estou usando essa variável porque não entendi bem o que .stream faz com a lista
        return auxList.stream().mapToDouble(Product::getPrice).sum();
    }
}
