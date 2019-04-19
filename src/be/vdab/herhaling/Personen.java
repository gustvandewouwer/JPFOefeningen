package be.vdab.herhaling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personen implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Persoon> personen = new ArrayList<>();

    public void add(Persoon persoon) {
        personen.add(persoon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Persoon persoon :
                personen) {
            sb.append(persoon.getVoornaam() + " " + persoon.getFamilienaam() + "\n");
        }
        return sb.toString();
    }
}
