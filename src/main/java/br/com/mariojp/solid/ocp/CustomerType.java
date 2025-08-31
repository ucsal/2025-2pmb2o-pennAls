package br.com.mariojp.solid.ocp;

public enum CustomerType {
    REGULAR(new RegularDiscount()),
    PREMIUM(new PremiumDiscount()),
    PARTNER(new PartnerDiscount());

    private final iDiscount discount;

    CustomerType(iDiscount discount) {
        this.discount = discount;
    }

    public double apply(double amount) {
        return discount.apply(amount);
    }
}
