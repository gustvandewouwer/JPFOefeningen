package be.vdab.model;

import java.util.Formatter;

public class Deodorant extends Product {
    public enum DeoType { VAPO, STICK};

    private DeoType deoType;

    public Deodorant(int productNummer, String merk, String naam, int volume, double prijs, DeoType deoType) {
        super(productNummer, merk, naam, volume, prijs);
        this.deoType = deoType;
    }

    public Deodorant(DeoType deoType) {
        this.deoType = deoType;
    }

    public Deodorant() {
    }

    @Override
    public String toString() {
//        return super.toString() + " " + deoType;
        StringBuilder sbuf = new StringBuilder(super.toString());
        Formatter fmt = new Formatter(sbuf);
        fmt.format("     %s", deoType);
        return sbuf.toString();

    }
}
