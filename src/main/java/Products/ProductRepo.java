package Products;

import java.util.HashMap;
import java.util.Objects;

public class ProductRepo {

    HashMap<String, Product> productsRepo;

    public ProductRepo(HashMap<String, Product> productsRepo) {
        this.productsRepo = productsRepo;
    }

    public HashMap<String, Product> getProductsRepo() {
        return productsRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(getProductsRepo(), that.getProductsRepo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductsRepo());
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productsRepo=" + productsRepo +
                '}';
    }
}
