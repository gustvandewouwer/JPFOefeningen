package be.vdab.mytestpersoneel;

public class Arbeider extends Werknemer {
    private static final long serialVersionUID = 1L;

    private static final float DEFAULT_UURLOON = 9.76f;

    private float uurloon;

    public Arbeider(String naam, WerknemersDatum datumInDienst, float uurloon) throws WerknemerException {
        super(naam, datumInDienst);
        setUurloon(uurloon);
    }

    public void setUurloon(float uurloon) {
        if (uurloon == 0.0) {
            this.uurloon = DEFAULT_UURLOON;
        } else {
            this.uurloon = uurloon;
        }
    }

    public float getUurloon() {
        return uurloon;
    }

    @Override
    public double getVerloning() {
        return (uurloon * 7.6 * 65 / 3);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + getVerloning();
    }

}
