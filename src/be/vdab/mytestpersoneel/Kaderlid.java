package be.vdab.mytestpersoneel;

public class Kaderlid extends Bediende {
    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_FUNCTIETITEL = "manager";

    private String functietitel;

    public Kaderlid(String naam, WerknemersDatum datumInDienst, double maandwedde, String functietitel) throws WerknemerException {
        super(naam, datumInDienst, maandwedde);
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

}
