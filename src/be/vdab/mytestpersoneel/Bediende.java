package be.vdab.mytestpersoneel;

public class Bediende extends Werknemer {
    private static final long serialVersionUID = 1L;

    private static final double DEFAULT_MAANDWEDDE = 1129.47;

    private double maandwedde;

//    public Bediende(String naam, InDienstDatum inDienstDatum, double maandwedde) throws WerknemerException {
    public Bediende(String naam, InDienstDatum inDienstDatum, double maandwedde) {
        super(naam, inDienstDatum);
        setMaandwedde(maandwedde);
    }

    public void setMaandwedde(double maandwedde) {
        if (maandwedde > 0.0d) {
            this.maandwedde = maandwedde;
        } else {
            if (maandwedde == 0.0d) {
                this.maandwedde = DEFAULT_MAANDWEDDE;
            } else {
                throw new IllegalArgumentException("ERROR: maandwedde mag niet negatief zijn");
            }
        }
    }

    public double getMaandwedde() {
        return maandwedde;
    }

    @Override
    public double getVerloning() {
        return maandwedde;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + maandwedde;
    }

    public void toon() {
        System.out.println("*** BEDIENDE");
        super.toon();
        System.out.println("\tmaandwedde: " + maandwedde);
    }


}
