package Shop;

import Orders.Order;
import Orders.OrderRepo;
import Products.Product;
import Products.ProductRepo;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ShopServiceTest {



    private Product TEST_PRODUCT1 = new Product("01", "Wecker");
    private Product TEST_PRODUCT2 = new Product("02", "Mauspad");
    private Product TEST_PRODUCT3 = new Product("03", "Maus");
    private Product TEST_PRODUCT4 = new Product("04", "USB-C Adapter");

    private Order TEST_ORDER1 = new Order("01", TEST_PRODUCT1);

    private Order TEST_ORDER2 = new Order("02", TEST_PRODUCT2);

    ProductRepo productRepo =new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    ShopService shopService = new ShopService(productRepo, orderRepo);
@Test
    void isProductAdded(){
    //GIVEN
    productRepo.addProduct(TEST_PRODUCT1);
    productRepo.addProduct(TEST_PRODUCT2);
    productRepo.addProduct(TEST_PRODUCT3);
    productRepo.addProduct(TEST_PRODUCT4);
    //WHEN
    String actual = shopService.getProduct("01");

    //THEN
    String expected = "Produkt-ID: 01\n Name: Wecker";

    assertEquals(expected,actual);
}

@Test
    void isntProductAdded(){
    //GIVEN
    productRepo.addProduct(TEST_PRODUCT1);
    productRepo.addProduct(TEST_PRODUCT2);
    productRepo.addProduct(TEST_PRODUCT3);
    productRepo.addProduct(TEST_PRODUCT4);
    //WHEN
    String actual = shopService.getProduct("01");

    //THEN
    String expected = "Produkt-ID: 01\n Name: Wcker";

    assertNotEquals(expected,actual);
}

    void isOrderAdded(){
    //GIVEN
    shopService.addOrder(TEST_ORDER1);

    //WHEN
        String actual = shopService.getOrder("01");
    //THEN

}



}
