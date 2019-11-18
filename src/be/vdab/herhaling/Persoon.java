package be.vdab.herhaling;

import java.io.Serializable;
import java.util.Objects;

public class Persoon implements Serializable, Comparable<Persoon> {
    private static final long serialVersionUID = 1L;

    private String voornaam;
    private String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public Persoon() {
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    public String getNaam() {
        return getVoornaam() + " " + getFamilienaam();
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", familienaam='" + familienaam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return voornaam.equals(persoon.voornaam) &&
                familienaam.equals(persoon.familienaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voornaam, familienaam);
    }

    @Override
    public int compareTo(Persoon persoon) {
        if (familienaam.compareTo(persoon.getFamilienaam()) < 0) return -1;
        else if (familienaam.compareTo(persoon.getFamilienaam()) > 0) return 1;
        else if (voornaam.compareTo(persoon.getVoornaam()) < 0) return -1;
        else if (voornaam.compareTo(persoon.getVoornaam()) > 0) return 1;
            return 0;

//        return this.getFamilienaam().compareTo(persoon.getFamilienaam()) * 10
//                + this.getVoornaam().compareTo(persoon.getVoornaam());
    }
}
