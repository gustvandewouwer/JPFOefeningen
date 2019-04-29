package be.vdab.mytestpersoneel;

public class Bediende extends Werknemer {
    private static final long serialVersionUID = 1L;

    private static final double DEFAULT_MAANDWEDDE = 1129.47;

    private double maandwedde;

    public Bediende(String naam, WerknemersDatum datumInDienst, double maandwedde) throws WerknemerException {
        super(naam, datumInDienst);
        setMaandwedde(maandwedde);
    }

    public void setMaandwedde(double maandwedde) throws WerknemerException {
        if (maandwedde == 0.0) {
            this.maandwedde = DEFAULT_MAANDWEDDE;
        } else {
            this.maandwedde = maandwedde;
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
        return super.toString() + "\t" + getVerloning();
    }
}
