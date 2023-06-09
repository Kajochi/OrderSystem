package Orders;

import Products.Product;

public class Order {
    String id;
     Product products;

    public Order(String id, Product products) {
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
