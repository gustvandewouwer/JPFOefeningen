package be.vdab.herhaling;

import java.math.BigDecimal;
import java.util.Objects;

public class Land implements Comparable<Land> {
    private String landCode;
    private BigDecimal aantalInwoners;

    public Land(String landCode, BigDecimal aantalInwoners) {
        this.landCode = landCode;
        this.aantalInwoners = aantalInwoners;
    }

    public Land() {
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public BigDecimal getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigDecimal aantalInwoners) {
        this.aantalInwoners = aantalInwoners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land land = (Land) o;
        return landCode.equals(land.landCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(landCode);
    }

    @Override
    public int compareTo(Land o) {
        return landCode.compareTo(o.getLandCode());
    }
}
