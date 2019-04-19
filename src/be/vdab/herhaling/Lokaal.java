package be.vdab.herhaling;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {
    private int nummer;
    private Trainer trainer;
    private List<Cursist> cursisten = new ArrayList<>();

    public Lokaal(int nummer, Trainer trainer) {
        this.nummer = nummer;
        this.trainer = trainer;
    }

    public Lokaal() {
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Cursist> getCursisten() {
        return cursisten;
    }

    public void setCursisten(List<Cursist> cursisten) {
        this.cursisten = cursisten;
    }

    public void cursistToevoegen(Cursist cursist) {
        cursisten.add(cursist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lokaal " + getNummer() + " " + getTrainer().getVoornaam() + " " + getTrainer().getFamilienaam() + "\n");
        sb.append(cursisten.size() + " cursisten:\n");
        for (Cursist cursist :
                cursisten) {
            sb.append(cursist.getVoornaam() + " " + cursist.getFamilienaam() + " volgt " + cursist.getTraject().getNaam() + "\n");
        }
        return sb.toString();
    }
}
