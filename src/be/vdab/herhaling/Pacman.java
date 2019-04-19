package be.vdab.herhaling;

public class Pacman extends PacmanFiguur {
    private int aantalLevens = 3;
    private boolean powerPill;

    public int getAantalLevens() {
        return aantalLevens;
    }

    public boolean isPowerPill() {
        return powerPill;
    }

    public void setPowerPill(boolean powerPill) {
        this.powerPill = powerPill;
    }

    public void setAantalLevens(int aantalLevens) {
        this.aantalLevens = aantalLevens;
    }

    public void eatPowerPill() {
        setPowerPill(true);
    }

    public void powerPillWorkedOut() {
        setPowerPill(false);
    }

    public void neemEenLevenWeg() {
        aantalLevens--;
    }

    public void meet(Monster monster) {
        if (powerPill) {
            Doolhof doolhof = monster.getDoolhof();
            doolhof.getMonsters().remove(monster);
            monster.setDoolhof(null);
        }
    }
}
