package pl.mlopatkiewicz.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import pl.mlopatkiewicz.ecommerce.catalog.ArrayListProductStorage;
import pl.mlopatkiewicz.ecommerce.catalog.ProductCatalog;

import java.math.BigDecimal;

@SpringBootTest
public class AppTest{
    @Test
    void contextLoads(){}

    @Bean
    ProductCatalog createMyProductCatalog(){
        ProductCatalog productCatalog = new ProductCatalog(new ArrayListProductStorage());
        productCatalog.addProduct("Lego set 1", "Nice one", BigDecimal.valueOf(20));
        productCatalog.addProduct("Lego set 2", "Nice one", BigDecimal.valueOf(10));
        return productCatalog;
    }
}