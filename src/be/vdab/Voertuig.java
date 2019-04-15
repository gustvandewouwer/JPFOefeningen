package be.vdab;

public abstract class Voertuig {
    private String polishouder = "onbepaald";
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat = "onbepaald";
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
}