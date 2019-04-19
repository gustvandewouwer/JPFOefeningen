package be.vdab.herhaling;

public class Time {
    private int uren;
    private int minuten;

    public Time(int uren, int minuten) {
        this.uren = uren;
        this.minuten = minuten;
    }

    public Time() {
    }

    public int getUren() {
        return uren;
    }

    public void setUren(int uren) {
        this.uren = uren;
    }

    public int getMinuten() {
        return minuten;
    }

    public void setMinuten(int minuten) {
        this.minuten = minuten;
    }

    public Time subtract(Time time) {
        int uren = getUren() - time.getUren();
        int minuten = getMinuten() - time.getMinuten();
        if (minuten < 0) {
            uren--;
            minuten += 60;
        }
        if (uren < 0) {
            uren += 24;
        }
        return new Time(uren, minuten);
    }

    public Time add(Time time) {
        int uren = getUren() + time.getUren();
        int minuten = getMinuten() + time.getMinuten();
        if (minuten >= 60) {
            uren++;
            minuten -= 60;
        }
        if (uren >= 24) {
            uren -= 24;
        }
        return new Time(uren, minuten);
    }

    @Override
    public String toString() {
        return uren + ":" + minuten;
    }
}
