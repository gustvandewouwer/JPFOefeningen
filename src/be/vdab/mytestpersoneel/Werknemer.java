package be.vdab.mytestpersoneel;

import java.io.Serializable;
import java.util.Objects;

public abstract class Werknemer implements Serializable, Comparable<Werknemer> {
    private static final long serialVersionUID = 1L;

    private static int HOOGSTE_PERSONEELSNUMMER = 0;

    private int personeelsnummer;
    private String naam;
    private InDienstDatum inDienstDatum;

//    public Werknemer(String naam, InDienstDatum inDienstDatum) throws WerknemerException {
    public Werknemer(String naam, InDienstDatum inDienstDatum)  {
        setNaam(naam);
        setInDienstDatum(inDienstDatum);
        setPersoneelsnummer();
    }

    public int getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer() {
        this.personeelsnummer = ++HOOGSTE_PERSONEELSNUMMER;
    }

    public InDienstDatum getInDienstDatum() {
        return inDienstDatum;
    }

    public void setInDienstDatum(InDienstDatum inDienstDatum) {
        if (inDienstDatum == null) {
            throw new IllegalArgumentException("ERROR: Indienstdatum is verplicht");
        }
        this.inDienstDatum = inDienstDatum;
    }

    public String getNaam() {
        return naam;
    }

//    public void setNaam(String naam) throws WerknemerException {
    public void setNaam(String naam)  {
        if ((naam == null) || naam.trim().isEmpty()) {
//            throw new WerknemerException("ERROR: Naam werknemer verplicht in te vullen");
            throw new IllegalArgumentException("ERROR: Naam werknemer verplicht");
        }
        this.naam = naam;
    }

    public abstract double getVerloning();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Werknemer werknemer = (Werknemer) o;
        return personeelsnummer == werknemer.personeelsnummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personeelsnummer);
    }

    @Override
    public String toString() {
        return personeelsnummer + ", " + inDienstDatum + ", " + naam;
    }

    public void toon() {
        System.out.println("\tpersoneelsnummer: " + personeelsnummer);
        System.out.println("\tnaam: " + naam);
        System.out.println("\tverloning: " + getVerloning());
        inDienstDatum.toon();
    }

    @Override
    public int compareTo(Werknemer o) {
        return personeelsnummer - o.getPersoneelsnummer();
//        return naam.compareTo(o.getNaam());
    }
}
