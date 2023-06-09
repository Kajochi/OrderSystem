package Products;

import java.util.HashMap;
import java.util.Objects;

public class ProductRepo {

    HashMap<String, Product> productsRepo;

    public ProductRepo() {
        this.productsRepo = new HashMap<>();
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

    public String list(){
        String list = "Produktliste: ";
        for (String key: this.productsRepo.keySet()) {
            list += "\nName: " + productsRepo.get(key).getName() + "\n ID: " + productsRepo.get(key).getId() + " ";
        }
        return list;

    }

    public String getProduct(String key){
        String product = "ProduktID";
        product +=  productsRepo.get(key).getId() + "\n Name: " + productsRepo.get(key).getName();
        return product;
    }
    public void addProduct(Product product){
        this.productsRepo.put(product.getId(), product);
    }
}
