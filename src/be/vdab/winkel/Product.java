package be.vdab.winkel;

import java.math.BigDecimal;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public final void setOmschrijving(String omschrijving) {
        if (omschrijving.trim().isEmpty()) {
            throw new IllegalArgumentException("omschrijving moet ingevuld worden");
        }
// we moeten niet controleren of omschrijving verschilt van null
// als dit het geval is, zal de expressie omschrijving.trim() hier
// boven zelf al een NullPointerException werpen
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public final void setPrijs(BigDecimal prijs) {
        if (prijs.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("prijs moet >=0");
        }
// we moeten niet controleren of prijs verschilt van null
// als dit het geval is, zal de expressie prijs.compareTo(...) hier
// boven zelf al een NullPointerException werpen
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Product)) {
            return false;
        }
        Product product = (Product) object;
        return omschrijving.equals(product.omschrijving);
    }

    @Override
    public int hashCode() {
        return omschrijving.hashCode();
    }

    @Override
    public String toString() {
        return omschrijving + ";" + prijs;
    }
}
