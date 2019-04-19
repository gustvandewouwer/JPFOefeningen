package be.vdab.herhaling;

import java.math.BigDecimal;

public class KasbonMain {
    public static void main(String[] args) {
        Klant klant = new Klant();
        klant.add(
                new NietKapitaliseerbareKasbon(BigDecimal.valueOf(100), 2, BigDecimal.valueOf(0.05)));
        klant.add(
                new KapitaliseerbareKasbon(BigDecimal.valueOf(100), 2, BigDecimal.valueOf(0.05)));

        System.out.println(klant.getEindWaarde());
    }
}
