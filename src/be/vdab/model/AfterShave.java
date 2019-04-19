package be.vdab.model;

import java.util.Formatter;

public class AfterShave extends Product {
    public enum Soort { VAPO, GEL};

    private Soort soort;

    public AfterShave(int productNummer, String merk, String naam, int volume, double prijs, Soort soort) {
        super(productNummer, merk, naam, volume, prijs);
        this.soort = soort;
    }

    public AfterShave(Soort soort) {
        this.soort = soort;
    }

    public AfterShave() {
    }

    @Override
    public String toString() {
//        return super.toString() + " " + soort;
        StringBuilder sbuf = new StringBuilder(super.toString());
        Formatter fmt = new Formatter(sbuf);
        fmt.format("     %s", soort);
        return sbuf.toString();

    }
}
