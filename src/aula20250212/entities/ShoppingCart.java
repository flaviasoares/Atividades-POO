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

    public void addProduct(int productTypeID, String productType, String productBrand, double productPrice, int productSize) {
        if (productTypeID == 1) {
            refrigerator = new Refrigerator(productType, productBrand, productPrice, productSize);
            productList.add(refrigerator);

        } else if (productTypeID == 2) {
            stove = new Stove(productType, productBrand, productPrice, productSize);
            productList.add(stove);
            
        } else if (productTypeID == 3) {
            tv = new TV(productType, productBrand, productPrice, productSize);
            productList.add(tv);
            
        } else if (productTypeID == 4) {
            product = new Product(productType, productBrand, productPrice);
            productList.add(product);
        }
    }

    public void removeProduct(String productType, int quantityRemove) {
        int quantityProduct = getItemCount(productType);
        if (quantityRemove == quantityProduct) {
            productList.removeIf(product -> product.getType().equals(productType));
        } else {
            int count = 0;
            Iterator<Product> it = productList.iterator();
            while (it.hasNext()) {
                if (it.next().getType().equals(productType)) {
                    it.remove();
                    count++;

                    if (count == quantityRemove) break;
                }
            }
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