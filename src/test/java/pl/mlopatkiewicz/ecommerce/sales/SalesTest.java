package pl.mlopatkiewicz.ecommerce.sales;

import org.junit.jupiter.api.Test;
import pl.mlopatkiewicz.ecommerce.sales.offer.Offer;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class SalesTest {

    @Test
    void itAddProductToCart(){
        var customerA = thereIsCustomer("Mateusz");
        var productA = thereIsProduct("product a", BigDecimal.valueOf(10));
        SalesFacade sales = thereIsSAlesFacade();
        //ACT
        sales.addToCart(customerA, productA);

        //ASSERT
        Offer currentOfferA = sales.getCurrentOffer(customerA);
        assertEquals(BigDecimal.valueOf(10), currentOfferA.getTotal());

    }

    private String thereIsProduct(String name, BigDecimal bigDecimal) {
        return "";
    }

    private String thereIsCustomer(String name) {
        return "";
    }

    @Test
    void itShowsOffer(){
        SalesFacade sales = thereIsSAlesFacade();
        String customerId = thereIsExampleCustomer("Jan");

        Offer offer = sales.getCurrentOffer(customerId);

        assertEquals(0, offer.getItemsCount());
        assertEquals(BigDecimal.ZERO, offer.getTotal());
    }

    private String thereIsExampleCustomer(String id) {
        return id;
    }

    private SalesFacade thereIsSAlesFacade() {
        return new SalesFacade();
    }

    @Test
    void itAllowsToAddProductToCart(){

    }

    @Test
    void itAllowsToRemoveProductFromCart(){

    }

    @Test
    void itAllowsToAcceptOffer(){
    }

}