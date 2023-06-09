package Orders;

import java.util.HashMap;
import java.util.Objects;

public class OrderRepo {
    HashMap<String, Order> orders;

    public OrderRepo() {
        this.orders = new HashMap<>();
    }

    public HashMap<String, Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(getOrders(), orderRepo.getOrders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrders());
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    public void add(Order order){

        this.orders.put(order.getId(), order);
    }

    public String list(){
        String listed = "Orderlist: ";
        int index = 0;
        if (this.orders.get("01") == null){
            listed = "Keine Bestellungen vorhanden.";
        }
        for (String key: this.orders.keySet()) {
            listed += "\n Order-ID: " + orders.get(key).getId() + "\nProduktname: " + orders.get(key).products.get(index).getName() +
            "Produkt-ID: " + orders.get(key).products.get(index).getId();
            index++;
        }
        return listed;
     }

     public String get(String key){
        int index = Integer.parseInt(key);
        return "Order-ID: " + orders.get(key).getId() + "\n Produktname: " + orders.get(key).products.get(index).getName() +
                "\n Produkt-ID: " + orders.get(key).products.get(index).getId();
     }
}
