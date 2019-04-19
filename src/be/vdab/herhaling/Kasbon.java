package be.vdab.herhaling;

import java.math.BigDecimal;

public abstract class Kasbon {
    private BigDecimal beginwaarde;
    private int jaren;
    private BigDecimal intrest;

    public Kasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        this.beginwaarde = beginwaarde;
        this.jaren = jaren;
        this.intrest = intrest;
    }

    public Kasbon() {
    }

    public BigDecimal getBeginwaarde() {
        return beginwaarde;
    }

    public void setBeginwaarde(BigDecimal beginwaarde) {
        this.beginwaarde = beginwaarde;
    }

    public int getJaren() {
        return jaren;
    }

    public void setJaren(int jaren) {
        this.jaren = jaren;
    }

    public BigDecimal getIntrest() {
        return intrest;
    }

    public void setIntrest(BigDecimal intrest) {
        this.intrest = intrest;
    }

    public abstract BigDecimal getBerekendeIntrest();
}
