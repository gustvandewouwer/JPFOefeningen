package be.vdab.util;

public class LandException extends Exception {
    public LandException() {}
    public LandException(String omschrijving) {
        super(omschrijving);
    }
}