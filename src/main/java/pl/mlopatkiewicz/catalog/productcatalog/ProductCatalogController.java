package pl.mlopatkiewicz.catalog.productcatalog;

import ecommerce.catalog.Product;
import ecommerce.catalog.ProductCatalog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductCatalogController {

    ProductCatalog catalog;

    public ProductCatalogController(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    @GetMapping("/api/products")
    List<Product> allProducts() {
        return catalog.allProducts();
    }
}
