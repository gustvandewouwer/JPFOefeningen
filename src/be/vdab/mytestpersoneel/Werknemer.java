package be.vdab.mytestpersoneel;

import java.io.Serializable;
import java.util.Objects;

public abstract class Werknemer implements Serializable, Comparable<Werknemer> {
    private static final long serialVersionUID = 1L;

    private static int HOOGSTE_PERSONEELSNUMMER = 0;

    private int personeelsnummer;
    private String naam;
    private WerknemersDatum datumInDienst;

    public Werknemer(String naam, WerknemersDatum datumInDienst) throws WerknemerException {
        setNaam(naam);
        setDatumInDienst(datumInDienst);
        setPersoneelsnummer();
    }

    public int getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer() {
        this.personeelsnummer = ++HOOGSTE_PERSONEELSNUMMER;
    }

    public WerknemersDatum getDatumInDienst() {
        return datumInDienst;
    }

    public void setDatumInDienst(WerknemersDatum datumInDienst) {
        this.datumInDienst = datumInDienst;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) throws WerknemerException {
        if ((naam == null) || naam.trim().isEmpty()) {
            throw new WerknemerException("Naam werknemer verplicht in te vullen");
        }
        this.naam = naam;
    }

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
        return personeelsnummer + ", " + datumInDienst + ", " + naam;
    }

    public abstract double getVerloning();

    @Override
    public int compareTo(Werknemer o) {
        return personeelsnummer - o.getPersoneelsnummer();
//        return naam.compareTo(o.getNaam());
    }
}
