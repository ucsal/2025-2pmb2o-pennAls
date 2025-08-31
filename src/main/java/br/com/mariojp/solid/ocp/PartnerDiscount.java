package br.com.mariojp.solid.ocp;

public class PartnerDiscount implements iDiscount {
    @Override
    public double apply(double amount) {
        return amount*0.88;

    }

}
