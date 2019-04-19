package be.vdab.herhaling;

import java.math.BigDecimal;
import java.util.ArrayList;

public class KostOpbrengstMain {
    public static void main(String[] args) {
        ArrayList arrKosten = new ArrayList<Kost>();
        arrKosten.add(new Gebouw(new BigDecimal(600)));
        arrKosten.add(new Instructeur(new BigDecimal(2000), new BigDecimal(50), new BigDecimal(20)));

        for (Object kost :
                arrKosten) {
            System.out.println(((Kost)kost).getKost());
        }

        Gebouw gebouw = new Gebouw();
        gebouw.setHuurprijs(BigDecimal.valueOf(1000));
        Instructeur instructeur = new Instructeur();
        instructeur.setMaandwedde(BigDecimal.valueOf(2000));
        Kost[] kosten = new Kost[] {gebouw, instructeur};
        BigDecimal totaleKost = BigDecimal.ZERO;
        for (Kost kost : kosten) {
            totaleKost = totaleKost.add(kost.getKost());
        }
        System.out.println(totaleKost);
    }
}
