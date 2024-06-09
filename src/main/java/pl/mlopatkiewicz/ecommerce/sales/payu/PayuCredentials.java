package pl.mlopatkiewicz.ecommerce.sales.payu;

public class PayuCredentials {
    private static String clientId = "";
    private static String clientSecret = "";

    boolean sandbox;

    public PayuCredentials(String clientId, String clientSecret, boolean sandbox) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sandbox = sandbox;
    }

    public static PayuCredentials sandbox(String clientId, String clientSecret) {
        return new PayuCredentials(clientId, clientSecret, true);
    }
    public String getBaseUrl() {
        if(sandbox) {
            return  "https://secure.snd.payu.com";
        } else {
            return "https://secure.payu.com";
        }
    }

    public static String getClientId() {
        return clientId;
    }

    public static String getClientSecret() {
        return clientSecret;
    }
}