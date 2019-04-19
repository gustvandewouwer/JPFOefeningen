package be.vdab.herhaling;

import java.math.BigDecimal;

public class GoedeDoel {
    private String naam;
    private BigDecimal bedrag = BigDecimal.ZERO;

    public GoedeDoel(String naam) {
        this.naam = naam;
    }

    public GoedeDoel() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void stort(BigDecimal bedrag) {
        this.bedrag = this.bedrag.add(bedrag);
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}
