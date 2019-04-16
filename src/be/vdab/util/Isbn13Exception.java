package be.vdab.util;

public class Isbn13Exception extends Exception {
    public Isbn13Exception() {}
    public Isbn13Exception(String omschrijving) {
        super(omschrijving);
    }
}