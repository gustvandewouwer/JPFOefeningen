package be.vdab.util;

public class RekeningnummerException extends Exception {
    private String foutRekeningNummer;

    public RekeningnummerException(String omschrijving) {
        super(omschrijving);
    }

    public RekeningnummerException(String omschrijving, String foutRekeningNummer) {
        super(omschrijving);
        this.foutRekeningNummer = foutRekeningNummer;
    }

    public String getFoutRekeningNummer() {
        return foutRekeningNummer;
    }
}