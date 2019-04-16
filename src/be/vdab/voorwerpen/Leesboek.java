package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;
import be.vdab.voorwerpen.Boek;

public class Leesboek extends Boek {
    private String onderwerp;
    private static final float WINSTMARGE = 1.5F;

    public Leesboek() throws Isbn13Exception {
        this("978-05-960-0920-5", "Leesboek Java", "O Reilly", 10.5F,
                "genre studie", "onderw Informatica");
    }

    public Leesboek(String isbn13, String titel, String auteur,
                    float aankoopPrijs, String genre, String onderwerp)
            throws Isbn13Exception {
        super(isbn13, titel, auteur, aankoopPrijs, genre);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public final void setOnderwerp(String onderwerp) {
        if (onderwerp != null)
            this.onderwerp = onderwerp;
    }

    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Onderwerp : " + onderwerp);
        System.out.println("Winst : " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopPrijs() * WINSTMARGE;
    }

    @Override
    public String toString() {
        return (super.toString() + " ; " + onderwerp + " ; " + WINSTMARGE);
    }
}