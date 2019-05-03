package be.vdab;

public enum Seizoen {
    LENTE(1,3), ZOMER(4,6), HERFST(7,9), WINTER(10,12);
    private final int beginMaand;
    private final int eindMaand;

    Seizoen(int beginMaand, int eindMaand) {
        this.beginMaand = beginMaand;
        this.eindMaand = eindMaand;
    }

    public int getBeginMaand() {
        return beginMaand;
    }

    public int getEindMaand() {
        return eindMaand;
    }
}