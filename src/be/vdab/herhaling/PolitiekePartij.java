package be.vdab.herhaling;

public class PolitiekePartij {
    private String naam;

    public PolitiekePartij(String naam) {
        this.naam = naam;
    }

    public PolitiekePartij() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "PolitiekePartij{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
