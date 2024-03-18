package ecommerce.catalog;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalogTest {
    @Test
    void itAllowsListingProducts() {
        ProductCatalog catalog = thereIsProductCatalog();

        List<Product> products = catalog.allProducts();

        assert products.isEmpty();

    }
    @Test
    void itAllowsToAddProduct(){
        ProductCatalog catalog = thereIsProductCatalog();
        catalog.addProduct("Legoset 8083", "name");

        List<Product> allProducts = catalog.allProducts();
        assertThat(allProducts)
                .hasSize(1);


    }
    @Test
    void itLoadsSingleProductById() {
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.addProduct("Legoset 8083", "nice");

        Product loaded = catalog.getById(id);

        assertThat(loaded.getId())
                .isEqualTo(id);

    }

    @Test
    void itAllowsToChangePrice() {
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.addProduct("Legoset 8083", "nice");

        catalog.changePrice(id, BigDecimal.valueOf(10.10));
        Product loaded = catalog.getProductBy(id);

        assertThat(loaded.getPrice())
                .isEqualTo(BigDecimal.valueOf(10.10));
    }
    private ProductCatalog thereIsProductCatalog() {

        return new ProductCatalog();
    }
}