package Shop;

import Orders.Order;
import Orders.OrderRepo;
import Products.Product;
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



    public String getProduct(String key){
        return this.productRepo.getProduct(key);
    }

    public String listProducts(){
        return this.productRepo.list();
    }

    public void addOrder(Order order){
        this.orderRepo.add(order);
    }

    public String getOrder(String key){
        return this.orderRepo.get(key);
    }

    public String listOrder(){
        return this.orderRepo.list();
    }


}
