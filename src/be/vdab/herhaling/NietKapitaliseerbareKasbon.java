package be.vdab.herhaling;

import java.math.BigDecimal;

public class NietKapitaliseerbareKasbon extends Kasbon {

    public NietKapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    public NietKapitaliseerbareKasbon() {
    }

    @Override
    public BigDecimal getBerekendeIntrest() {
        return getBeginwaarde().add(
                getBeginwaarde().multiply(getIntrest()).multiply(BigDecimal.valueOf(getJaren())));
    }
}
