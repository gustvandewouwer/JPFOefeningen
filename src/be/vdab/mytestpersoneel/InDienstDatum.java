package be.vdab.mytestpersoneel;

import java.time.LocalDate;

public class InDienstDatum extends Datum {
    private final static LocalDate OPRICHTINGS_DATUM = LocalDate.of(1977, 2, 12);

    public InDienstDatum(int dag, int maand, int jaar) throws DatumException {
        super(dag, maand, jaar);
        if (!isGeldigeDatum()) {
            throw new DatumException(maakFoutmelding(dag, maand, jaar));
        }
    }

    public InDienstDatum() throws DatumException {
        super();
        if (!isGeldigeDatum()) {
            throw new DatumException(maakFoutmelding(getDag(), getMaand(), getJaar()));
        }
    }

    private boolean isGeldigeDatum() {
        LocalDate wnDatum = LocalDate.of(getJaar(), getMaand(), getDag());
        if (wnDatum.isBefore(OPRICHTINGS_DATUM)) {
            return false;
        }
        return true;
    }

    private String maakFoutmelding(int dag, int maand, int jaar) {
        return "ERROR: Indienstdatum (dag=" + dag + " maand=" + maand + " jaar=" + jaar + ")" +
                " ligt voor de oprichtingsdatum (dag=" + OPRICHTINGS_DATUM.getDayOfMonth() +
                " maand=" + OPRICHTINGS_DATUM.getMonthValue() +
                " jaar=" + OPRICHTINGS_DATUM.getYear() + ")";
    }

    public void toon() {
        System.out.println("\tDatum in dienst:");
        super.toon();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
