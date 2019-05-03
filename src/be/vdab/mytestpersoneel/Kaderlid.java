package be.vdab.mytestpersoneel;

public class Kaderlid extends Bediende {
    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_FUNCTIETITEL = "manager";

    private String functietitel;

//    public Kaderlid(String naam, InDienstDatum inDienstDatum, double maandwedde, String functietitel) throws WerknemerException {
    public Kaderlid(String naam, InDienstDatum inDienstDatum, double maandwedde, String functietitel) {
        super(naam, inDienstDatum, maandwedde);
        setFunctietitel(functietitel);
    }

    public void setFunctietitel(String functietitel) {
        if ((functietitel == null) || (functietitel.trim().isEmpty())) {
            this.functietitel = DEFAULT_FUNCTIETITEL;
        } else {
            this.functietitel = functietitel;
        }
    }

    public String getFunctietitel() {
        return functietitel;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + functietitel;
    }

    public void toon() {
        System.out.println("*** KADERLID");
        super.toon();
        System.out.println("\tfunctietitel: " + functietitel);
    }
}
