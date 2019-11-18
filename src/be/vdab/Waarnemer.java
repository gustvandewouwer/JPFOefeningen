package be.vdab;

public class Waarnemer {
    private int maxTemp;
    private int aantalWaarnemingen;

    public Waarnemer() {
        maxTemp = Integer.MIN_VALUE;
        aantalWaarnemingen = 0;
    }

    public int getMaxTemp() {
        if (aantalWaarnemingen > 0) {
            return maxTemp;
        }
        return 0;
    }

    public int getAantalWaarnemingen() {

        return aantalWaarnemingen;
    }

    public void registreer(int temp) {
        aantalWaarnemingen = aantalWaarnemingen + 1;
        if (temp > maxTemp) {
            maxTemp = temp;
        }
    }
}