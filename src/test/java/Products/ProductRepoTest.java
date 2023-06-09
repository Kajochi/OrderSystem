package Products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepoTest {

    @Test

    void wasProductAdded(){
    //GIVEN
        Product product = new Product("01", "Kopfschmerztabletten");

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product);
        //WHEN

        String actual = productRepo.getProduct("01");
        //THEN
        String expected = "Produkt-ID: 01\n Name: Kopfschmerztabletten";
        assertEquals(expected,actual);

    }

    @Test
    void wasntProductAdded(){
        Product product = new Product("01", "Kopfschmerztabletten");

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product);
        //WHEN

        String actual = productRepo.getProduct("01");
        //THEN
        String expected = "Produkt-ID: 01\n Nam: Kopfschmerztabletten";
        assertNotEquals(expected,actual);
    }
}
