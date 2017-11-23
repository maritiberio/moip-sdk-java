package br.com.moip.resource.links;

public class OrderLinks {

    private Href self;
    private Checkout checkout;

    public String getSelf() {
        return self.getHref();
    }

    public Checkout getCheckout() {
        return checkout;
    }

    @Override
    public String toString() {
        return new StringBuilder("OrderLinks{")
            .append("self=").append(self)
            .append(", checkout=").append(checkout)
            .append('}').toString();
    }
}
