package be.vdab.herhaling;

public class Monster extends PacmanFiguur {
    private String naam;

    public Monster(String naam) {
        this.naam = naam;
    }

    public Monster() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void meet(Pacman pacman) {
        if (pacman.isPowerPill()) {
            getDoolhof().getMonsters().remove(this);
        } else {
            pacman.neemEenLevenWeg();
        }
    }
}
