package Orders;

import Products.Product;

import java.util.ArrayList;

public class Order {
   private String id;
     Product product;

    public Order(String id, Product product) {
        this.id = id;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
