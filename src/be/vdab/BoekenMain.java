package be.vdab;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class BoekenMain {
    public static void main(String[] args) {
        Voorwerp[] voorwerpen = new Voorwerp[3];
        try {
            voorwerpen[0] = new Leesboek();
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[1] = new Leesboek("978-14-302-4764-7",
                    "Studieboek Java 7", "Oracle", 20.4F,
                    "genre Informatica", "onderw programmeren");
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[2] = new Woordenboek("978-90-664-8143-9",
                    "Woordenboek Engels", "Van Dale", 30.10F,
                    "genre vertaal woordenboek", "taal Engels-Nederlands");
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        float totaleWinst = 0;
        for (Voorwerp eenVoorwerp : voorwerpen) {
            if (eenVoorwerp != null) {
                eenVoorwerp.gegevensTonen();
                System.out.println();
                totaleWinst += eenVoorwerp.winstBerekenen();
            }
        }
        System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
}

