package be.vdab.herhaling;

public class Politieker extends Persoon {
    private PolitiekePartij politiekePartij;

    public Politieker(String voornaam, String familienaam, PolitiekePartij politiekePartij) {
        super(voornaam, familienaam);
        this.politiekePartij = politiekePartij;
    }

    public Politieker(PolitiekePartij politiekePartij) {
        this.politiekePartij = politiekePartij;
    }

    public PolitiekePartij getPolitiekePartij() {
        return politiekePartij;
    }

    public void setPolitiekePartij(PolitiekePartij politiekePartij) {
        this.politiekePartij = politiekePartij;
    }

    @Override
    public String toString() {
        return "Politieker{" +
                super.toString() +
                "politiekePartij=" + politiekePartij +
                '}';
    }
}
