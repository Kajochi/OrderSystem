package Orders;

import Products.Product;

import java.util.ArrayList;

public class Order {
   private String id;
     ArrayList<Product> products;

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
