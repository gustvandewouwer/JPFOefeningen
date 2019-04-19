package be.vdab.herhaling;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst {
    private BigDecimal maandwedde;
    private BigDecimal uurPrijsPerLes;
    private BigDecimal aantalUrenLesAanWerknemers;

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerLes, BigDecimal aantalUrenLesAanWerknemers) {
        this.maandwedde = maandwedde;
        this.uurPrijsPerLes = uurPrijsPerLes;
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    public Instructeur() {
    }

    public BigDecimal getMaandwedde() {
        return maandwedde;
    }

    public void setMaandwedde(BigDecimal maandwedde) {
        this.maandwedde = maandwedde;
    }

    public BigDecimal getUurPrijsPerLes() {
        return uurPrijsPerLes;
    }

    public void setUurPrijsPerLes(BigDecimal uurPrijsPerLes) {
        this.uurPrijsPerLes = uurPrijsPerLes;
    }

    public BigDecimal getAantalUrenLesAanWerknemers() {
        return aantalUrenLesAanWerknemers;
    }

    public void setAantalUrenLesAanWerknemers(BigDecimal aantalUrenLesAanWerknemers) {
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    @Override
    public BigDecimal getKost() {
        return getMaandwedde();
    }

    @Override
    public BigDecimal getOpbrengst() {
        return getUurPrijsPerLes().multiply(getAantalUrenLesAanWerknemers());
    }
}
