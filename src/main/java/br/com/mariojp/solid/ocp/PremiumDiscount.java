package br.com.mariojp.solid.ocp;

public class PremiumDiscount implements iDiscount {
    @Override
    public double apply(double amount) {
        return amount*0.90;
    }
}
