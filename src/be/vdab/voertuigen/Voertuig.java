package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

import java.util.Objects;

public abstract class Voertuig implements Milieu, Privaat, Comparable<Voertuig> {
    private String polishouder = "onbepaald";
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat = "onbepaald";

    @Override
    public void geefMilieuData() {
        System.out.println("--- Milieu data van voertuig ---");
        System.out.println("PK :" + getPk());
        System.out.println("Kostprijs :" + getKostprijs());
        System.out.println("Gem. verbruik :" + getGemVerbruik());
    }

    @Override
    public void geefPrivateData() {
        System.out.println("--- Private data van voertuig ---");
        System.out.println("Polishouder :" + getPolishouder());
        System.out.println("Nummerplaat :" + getNummerplaat());
    }

    public Voertuig() {
    }
    public Voertuig(String polishouder, float kostprijs,
                    int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }
    public String getPolishouder() {
        return polishouder;
    }
    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty())
            this.polishouder = polishouder;
    }
    public float getKostprijs() {
        return kostprijs;
    }
    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F)
            this.kostprijs = kostprijs;
    }
    public int getPk() {
        return pk;
    }
    public final void setPk(int pk) {
        if (pk > 0)
            this.pk = pk;
    }
    public float getGemVerbruik() {
        return gemVerbruik;
    }
    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F)
            this.gemVerbruik = gemVerbruik;
    }
    public String getNummerplaat() {
        return nummerplaat;
    }
    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty())
            this.nummerplaat = nummerplaat;
    }
    @Override
    public String toString() {
        return polishouder + " ; " + kostprijs + " ; " +
                pk + " ; " + gemVerbruik + " ; " + nummerplaat;
    }
    public void toon() {
        System.out.println("polishouder: " + polishouder);
        System.out.println("kostprijs: " + kostprijs);
        System.out.println("pk: " + pk);
        System.out.println("gemVerbruik: " + gemVerbruik);
        System.out.println("nummerplaat: " + nummerplaat);
    }
    public abstract double getKyotoScore();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nummerplaat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Voertuig)) {
            return false;
        }
        Voertuig v = (Voertuig) obj;
        return nummerplaat.equals(v.getNummerplaat() );
    }

    @Override
    public int compareTo(Voertuig v) {
        return nummerplaat.compareTo(v.getNummerplaat()) ;
    }
}