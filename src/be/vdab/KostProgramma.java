package be.vdab;

import be.vdab.voertuigen.Vrachtwagen2;

public class KostProgramma {
    public static void main(String[] args) {
        Werknemer eddy = new Werknemer("Eddy", 2000.0);
        Werknemer elly = new Werknemer("Elly", 2500.0);
        Vrachtwagen2 daf = new Vrachtwagen2("DAF", 0.35, 25000, 150000.0, 8);
        Kopieermachine konica = new Kopieermachine("Konica", 0.02, 9000);
        double personeelsKosten = 0.0;
        double andereKosten = 0.0;

        if (eddy.personeelsKost()) personeelsKosten += eddy.bedragKost();
        else andereKosten += eddy.bedragKost();

        if (elly.personeelsKost()) personeelsKosten += elly.bedragKost();
        else
            andereKosten += elly.bedragKost();

        if (daf.personeelsKost()) personeelsKosten += daf.bedragKost();
        else
            andereKosten += daf.bedragKost();

        if (konica.personeelsKost()) personeelsKosten = personeelsKosten + konica.bedragKost();
        else andereKosten = andereKosten + konica.bedragKost();

        System.out.println("Personeelskosten :" + personeelsKosten);
        System.out.println("Andere kosten : " + andereKosten);

        Afschrijving.beschrijving();
    }
}
