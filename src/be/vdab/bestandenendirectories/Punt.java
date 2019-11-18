package be.vdab.bestandenendirectories;

import java.io.Serializable;

public class Punt implements Serializable {
    private static final long serialVersionUID = 1L;

    private final int x;
    private final int y;
    private final int z;
    private final int a;
    private final Integer intVeld =new Integer(10);

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.a = 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " - " + y + " - " + z + " - " + a;
    }
}
