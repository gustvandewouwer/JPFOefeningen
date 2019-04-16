package be.vdab;

import be.vdab.voertuigen.Vrachtwagen2;

public class KostProgramma2 {
    public static void main(String[] args) {
        Kost[] kosten = new Kost[4];
        kosten[0] = new Werknemer("Eddy", 2000.0);
        kosten[1] = new Werknemer("Elly", 2500.0);
        kosten[2] = new Vrachtwagen2("DAF", 0.35, 25000, 150000.0, 8);
        kosten[3] = new Kopieermachine("Konica", 0.02, 9000);
        double personeelsKosten = 0.0;
        double andereKosten = 0.0;
        for (Kost eenKost : kosten) {
            if (eenKost.personeelsKost()) personeelsKosten += eenKost.bedragKost();
            else andereKosten += eenKost.bedragKost();
        }
        System.out.println("Personeelskosten :" + personeelsKosten);
        System.out.println("Andere kosten : " + andereKosten);
    }
}
