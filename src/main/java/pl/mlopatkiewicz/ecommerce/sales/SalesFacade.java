package pl.mlopatkiewicz.ecommerce.sales;


import pl.mlopatkiewicz.ecommerce.sales.cart.Cart;
import pl.mlopatkiewicz.ecommerce.sales.cart.HashMapCartStorage;
import pl.mlopatkiewicz.ecommerce.sales.offer.AcceptOfferRequest;
import pl.mlopatkiewicz.ecommerce.sales.offer.Offer;
import pl.mlopatkiewicz.ecommerce.sales.reservation.ReservationDetail;

public class SalesFacade {
    private HashMapCartStorage cartStorage;

    public Offer getCurrentOffer(String customerId) {
        return new Offer();
    }

    public void addToCart(String customerId, String productId) {

    }

    private Cart loadCartForCustomer(String customerId) {
        return null;//cartStorage.fundByCutomer(customerId)
        //.orElse(Cart.empty());
    }

    public ReservationDetail acceptOffer(String customerId, AcceptOfferRequest acceptOfferRequest) {
        return new ReservationDetail();
    }

}