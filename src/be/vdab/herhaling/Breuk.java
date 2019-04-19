package be.vdab.herhaling;

public class Breuk {
    private int teller;
    private int noemer;

    public Breuk(int teller, int noemer) {
        if (noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet 0 zijn");
        }
        this.teller = teller;
        this.noemer = noemer;
    }

    public Breuk() {
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }

    @Override
    public String toString() {
        return teller + "/" + noemer;
    }
}
