package be.vdab.mytestpersoneel;

import java.io.Serializable;
import java.time.LocalDate;

public class WerknemersDatum extends Datum implements Serializable {
    private final static LocalDate oprichtingsdatum = LocalDate.of(1977, 2, 12);

    public WerknemersDatum(int dag, int maand, int jaar) throws DatumException {
        super(dag, maand, jaar);
        LocalDate wnDatum = LocalDate.of(jaar, maand, dag);
        if (wnDatum.isBefore(oprichtingsdatum)) {
            throw new DatumException("Ongeldige werknemersdatum (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")");
        }
    }

    public WerknemersDatum() {
    }
}
