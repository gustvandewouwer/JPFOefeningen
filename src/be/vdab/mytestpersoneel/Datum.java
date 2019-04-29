package be.vdab.mytestpersoneel;

public class Datum {
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int dag, int maand, int jaar) throws DatumException {
        setJaar(jaar);
        setMaand(maand);
        setDag(dag);
    }

    public Datum() {
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) throws DatumException {
        if (dag < 0 || dag > 31) {
            throw new DatumException("Foutieve dag (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
        }
        if ((maand == 4 || maand == 6 || maand == 9 || maand == 11) && (dag > 30)) {
            throw new DatumException("Slechts 30 dagen in deze maand (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
        }
        if (maand == 2) {
            if (dag > 29) {
                throw new DatumException("Maximaal 29 dagen in februari (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
            }
            if ((dag == 29) && (!isSchrikkeljaar())) {
                throw new DatumException("Maximaal 28 dagen in februari indien geen schrikkeljaar (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
            }
        }

        this.dag = dag;
    }

    public int getMaand() {
        return maand;
    }

    public void setMaand(int maand) throws DatumException {
        if ((maand < 0) || (maand > 12)) {
            throw new DatumException("Foutieve maand (1-12) (maand=" + maand + ")");
        }
        this.maand = maand;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) throws DatumException {
        if ((jaar <= 1584) || (jaar > 4099)) {
            throw new DatumException("Foutief jaar (jaar=" + jaar + ")");
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
}
