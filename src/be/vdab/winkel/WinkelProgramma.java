package be.vdab.winkel;

import java.util.Map;

public class WinkelProgramma {
    public static void main(String[] args) {
        Catalogus catalogus = new Catalogus();
//de catalogus wordt meteen gevuld door de constructor
        Mandje mandje = new Mandje();
//Catalogus overlopen + mandje programmatorisch vullen
        int teller = 1;
        for (Product product : catalogus.getProducten()) {
            if (teller % 2 == 0) {
                mandje.add(product, teller);
            }
            teller++;
        }
        System.out.println("U kocht:");
        for (Map.Entry entry : mandje.getMandje().entrySet()) {
            System.out.println((entry.getKey()) + "; aantal stuks: "
                    + entry.getValue());
        }
        System.out.println();
        System.out.println("U kocht voor een totaal van: " +
                mandje.getTotalePrijs());
    }
}
