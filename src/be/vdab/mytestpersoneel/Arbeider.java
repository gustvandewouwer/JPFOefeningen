package be.vdab.mytestpersoneel;

public class Arbeider extends Werknemer {
    private static final long serialVersionUID = 1L;

    private static final float DEFAULT_UURLOON = 9.76f;

    private float uurloon;

//    public Arbeider(String naam, InDienstDatum inDienstDatum, float uurloon) throws WerknemerException {
    public Arbeider(String naam, InDienstDatum inDienstDatum, float uurloon)  {
        super(naam, inDienstDatum);
        setUurloon(uurloon);
    }

    public void setUurloon(float uurloon) {
        if (uurloon > 0.0f) {
            this.uurloon = uurloon;
        } else {
            if (uurloon == 0.0f) {
                this.uurloon = DEFAULT_UURLOON;
            } else {
                throw new IllegalArgumentException("ERROR: Uurloon mag niet negatief zijn");
            }
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
        return super.toString() + ", " + uurloon;
    }

    public void toon() {
        System.out.println("*** ARBEIDER");
        super.toon();
        System.out.println("\tuurloon: " + uurloon);
    }
}
