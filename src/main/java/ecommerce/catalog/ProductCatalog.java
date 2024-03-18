package ecommerce.catalog;
import java.math.BigDecimal;
import  java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


public class ProductCatalog {
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public List<Product> allProducts(){
        return Collections.unmodifiableList(products);
    }

    public String addProduct(String name, String description) {

        UUID id = UUID.randomUUID();
        Product newProduct = new Product(id, name, description);

        ArrayList<Product> products = new ArrayList<>();
        products.add(newProduct);

        return id.toString();
    }


    public Product getProductBy(String id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .get();
    }

    public void changePrice(String id, BigDecimal bigDecimal) {
        Product loadedProduct = getProductBy(id);
        loadedProduct.getPrice(price);
    }

    public Product getById(String id) {
        return null;
    }
}
