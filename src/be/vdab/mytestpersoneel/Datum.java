package be.vdab.mytestpersoneel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.IntStream;

public class Datum implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int[] MAANDEN_MET_30_DAGEN = new int[]{4, 6, 9, 11};

    private int dag;
    private int maand;
    private int jaar;

    public Datum(int dag, int maand, int jaar) throws DatumException {
        setJaar(jaar);
        setMaand(maand);
        setDag(dag);
    }

    public Datum() {
        LocalDate nu = LocalDate.now();
        dag = nu.getDayOfMonth();
        maand = nu.getMonthValue();
        jaar = nu.getYear();
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) throws DatumException {
        if (dag < 1 || dag > 31) {
            throw new DatumException("ERROR: Foutieve dag (dag=" + dag + ")");
        }

        if (IntStream.of(MAANDEN_MET_30_DAGEN).anyMatch(x -> x == getMaand()) && (dag > 30)) {
            throw new DatumException("ERROR: Maximaal 30 dagen in deze maand (dag=" + dag + " maand=" + maand + ")");
        }

//        if ((maand == 4 || maand == 6 || maand == 9 || maand == 11) && (dag > 30)) {
//            throw new DatumException("Slechts 30 dagen in deze maand (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
//        }

        if (maand == 2) {
            if (dag > 29) {
                throw new DatumException("ERROR: Maximaal 29 dagen in februari (dag=" + dag + " maand=" + maand + ")");
            } else {
                if ((dag == 29) && (!isSchrikkeljaar())) {
                    throw new DatumException("ERROR: Maximaal 28 dagen in februari indien geen schrikkeljaar (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
                }
            }
        }

        this.dag = dag;
    }

    public int getMaand() {
        return maand;
    }

    public void setMaand(int maand) throws DatumException {
        if ((maand < 1) || (maand > 12)) {
            throw new DatumException("ERROR: Foutieve maand (1-12) (maand=" + maand + ")");
        }
        this.maand = maand;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) throws DatumException {
        if ((jaar < 1584) || (jaar > 4099)) {
            throw new DatumException("ERROR: Foutief jaar (jaar=" + jaar + ")");
        }
        this.jaar = jaar;
    }

    private boolean isSchrikkeljaar() {
        if (jaar % 400 == 0) {
            return true;
        }
        if (jaar % 100 == 0) {
            return false;
        }
        if (jaar % 4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return dag + ", " + maand + ", " + jaar;
    }

    public void toon() {
        System.out.println("\tdag: " + dag);
        System.out.println("\tmaand: " + maand);
        System.out.println("\tjaar: " + jaar);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datum datum = (Datum) o;
        return dag == datum.dag &&
                maand == datum.maand &&
                jaar == datum.jaar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dag, maand, jaar);
    }
}
