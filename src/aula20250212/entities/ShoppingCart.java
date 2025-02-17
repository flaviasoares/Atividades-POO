package aula20250212.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<Product>();
    Product product;
    Refrigerator refrigerator;
    Stove stove;
    TV tv;

    public ShoppingCart(int customerID, ArrayList<Product> productList) {
        this.customerID = customerID;
        this.productList = productList;
    }

    public void addProduct(String productType, String productBrand, double productPrice, int productSize) {
        if (productType == "refrigerator") {
            refrigerator = new Refrigerator(productType, productBrand, productPrice, productSize);
            productList.add(refrigerator);

        } else if (productType == "stove") {
            stove = new Stove(productType, productBrand, productPrice, productSize);
            productList.add(stove);
            
        } else if (productType == "tv") {
            tv = new TV(productType, productBrand, productPrice, productSize);
            productList.add(tv);
            
        } else {
            product = new Product(productType, productBrand, productPrice);
            productList.add(product);
        }
    }

    public void removeProduct(String productType, int quantityRemove) {
        int quantityProduct = getItemCount(productType);

        if (quantityProduct > 0) {
            if (quantityRemove <= quantityProduct && quantityRemove > 0) {
                int count = 0;
                Iterator<Product> it = productList.iterator();
                while (it.hasNext()) {
                    if (it.next().getType().equals(productType)) {
                        it.remove();
                        count++;
        
                        if (count == quantityRemove) break;
                    }
                }
            }  else {
                System.out.println("Nenhum produto foi removido.");
            }
        } else {
            System.out.println("Erro ao remover os produtos do carrinho de compras.");
        }

    }
    
    public String getContents() {
        return productList.stream().map(product -> "Tipo: " + product.getType() + ", Marca: " + product.getBrand() + ", Preço: " + product.getPrice()).collect(Collectors.joining("\n"));
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount(String productType) {
        return (int) productList.stream().filter(product -> product.getType().equals(productType)).count();
    }

    public double getTotalPrice() {
        return productList.stream().mapToDouble(Product::getPrice).sum();
    }
}