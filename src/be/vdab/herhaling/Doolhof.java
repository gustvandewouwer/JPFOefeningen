package be.vdab.herhaling;

import java.util.ArrayList;
import java.util.List;

public class Doolhof {
    private Pacman pacman;
    private List<Monster> monsters = new ArrayList<>();

    public Pacman getPacman() {
        return pacman;
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public void add(Pacman pacman) {
        setPacman(pacman);
        pacman.setDoolhof(this);
    }

    public void add(Monster monster) {
        monsters.add(monster);
        monster.setDoolhof(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pacman ").append(pacman.getAantalLevens()).append(" leven(s)");
        for (Monster monster: monsters
             ) {
                sb.append(", ").append(monster.getNaam());
        }
        return sb.toString();
    }
}
