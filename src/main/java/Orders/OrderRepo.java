package Orders;

import java.util.HashMap;
import java.util.Objects;

public class OrderRepo {
    HashMap<String, Order> orders;

    public OrderRepo(HashMap<String, Order> orders) {
        this.orders = orders;
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

    public void addOrder(Order order){

        this.orders.put(order.getId(), order);
    }
}
