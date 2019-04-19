package be.vdab.herhaling;

import java.math.BigDecimal;

public class KapitaliseerbareKasbon extends Kasbon {

    public KapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    public KapitaliseerbareKasbon() {
    }

    @Override
    public BigDecimal getBerekendeIntrest() {
        BigDecimal totaleIntrest = BigDecimal.ZERO;
        for (int i = 0; i < getJaren(); i++) {
            totaleIntrest = totaleIntrest.add
                    (getBeginwaarde().multiply(getIntrest())).add(totaleIntrest.multiply(getIntrest()));
        }
        return getBeginwaarde().add(totaleIntrest);
    }
}
