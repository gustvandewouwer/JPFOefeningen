package be.vdab.herhaling;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Klant {
    private List<Kasbon>  kasbons = new ArrayList<>();

    public void add(Kasbon kasbon) {
        kasbons.add(kasbon);
    }

    public BigDecimal getEindWaarde() {
        BigDecimal eindWaarde = BigDecimal.ZERO;
        for (Kasbon kasbon :
                kasbons) {
            BigDecimal res = kasbon.getBerekendeIntrest();
            eindWaarde = eindWaarde.add(res);
        }
        return eindWaarde;
    }
}
