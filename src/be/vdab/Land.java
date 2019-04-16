package be.vdab;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode, landNaam, hoofdstad;
    private BigInteger aantInwoners;
    private BigDecimal oppervlakte;

    public Land(String code, String naam, String hoofdstad,
                BigInteger inwoners, BigDecimal opp) throws LandException {
        setLandCode(code);
        setLandNaam(naam);
        setHoofdstad(hoofdstad);
        setAantalInwoners(inwoners);
        setOppervlakte(opp);
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(String landCode) throws LandException {
        if ((landCode == null) || landCode.trim().isEmpty()) {
            throw new LandException("Landcode verplicht in te vullen");
        }
        this.landCode = landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public final void setLandNaam(String landNaam) throws LandException {
        if ((landNaam == null) || landNaam.trim().isEmpty()) {
            throw new LandException("Landnaam verplicht in te vullen");
        }
        this.landNaam = landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public final void setHoofdstad(String hoofdstad) throws LandException {
        if ((hoofdstad == null) || hoofdstad.trim().isEmpty()) {
            throw new LandException("Hoofdstad verplicht in te vullen");
        }
        this.hoofdstad = hoofdstad;
    }

    public BigInteger getAantInwoners() {
        return aantInwoners;
    }

    public final void setAantalInwoners(BigInteger inwoners) throws
            LandException {
        if (inwoners.compareTo(BigInteger.ZERO) <= 0) {
            throw new LandException("Aantal inwoners moet groter dan 0 zijn");
        }
        aantInwoners = inwoners;
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public final void setOppervlakte(BigDecimal opp) throws LandException {
        if (opp.compareTo(BigDecimal.ZERO) <= 0) {
            throw new LandException("Oppervlakte moet groter dan 0 zijn");
        }
        oppervlakte = opp;
    }

    public BigDecimal bevolkingsDichtheid() {
        BigDecimal bevolkingsDichtHeid =
                (new BigDecimal(aantInwoners))
                        .divide(oppervlakte, 2, RoundingMode.HALF_UP);
//aangezien aantalInwoners een BigInteger is kan de valueOf
//alsvolgt gebruikt worden:
//(BigDecimal.valueOf(aantInwoners.intValue()))
// .divide(oppervlakte, 2, RoundingMode.HALF_UP);
        return bevolkingsDichtHeid;
    }

    @Override
    public String toString() {
        return landCode + " ; " + landNaam + " ; " + hoofdstad + " ; " +
                aantInwoners + " ; " + oppervlakte + " ; " +
                bevolkingsDichtheid();
    }
}