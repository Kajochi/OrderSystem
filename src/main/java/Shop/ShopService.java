package Shop;

import Orders.Order;
import Orders.OrderRepo;
import Products.ProductRepo;

import java.util.Objects;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(getProductRepo(), that.getProductRepo()) && Objects.equals(getOrderRepo(), that.getOrderRepo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductRepo(), getOrderRepo());
    }

    public void addOrder(Order order){
        this.orderRepo.addOrder(order);
    }


}
