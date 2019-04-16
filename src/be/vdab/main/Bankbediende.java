package be.vdab.main;

import be.vdab.rekening.Rekening;
import be.vdab.rekening.Spaarrekening;
import be.vdab.rekening.Zichtrekening;
import be.vdab.util.RekeningnummerException;

public class Bankbediende {
    public static void main(String[] args) {

        Rekening[] rekeningen = new Rekening[7];
        try {
            rekeningen[0] = new Spaarrekening("BE68 1234 5678 9002", 1.5);
            rekeningen[0].storten(100.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rekeningen[1] = new Zichtrekening(null, 1500);
            rekeningen[1].storten(200.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rekeningen[2] = new Zichtrekening("BE68 1234 5678 9103", 2000);
            rekeningen[2].storten(300.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rekeningen[3] = new Zichtrekening("", 1500);
            rekeningen[3].storten(400.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rekeningen[4] = new Zichtrekening("AB68 1234", 1500);
            rekeningen[6] = new Zichtrekening(null, 1500);
            rekeningen[4].storten(500.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage() + ": " + ex.getFoutRekeningNummer());
        }
        try {
            rekeningen[5] = new Zichtrekening("BEZZ 1112 2444 4891", 1500);
            rekeningen[5].storten(600.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rekeningen[6] = new Spaarrekening("BE68 1234 5678 9204", 1.5);
            rekeningen[6].storten(400.0);
        } catch (RekeningnummerException ex) {
            System.out.println(ex.getMessage());
        }
        for (Rekening rekening : rekeningen) {
            if (rekening != null) {
                System.out.println("\n" + rekening + "\nSaldo van de " + "rekening: " + rekening.getSaldo());
            }
        }


        System.out.println("Intrestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());
        Spaarrekening spaar = null;
        try {
            spaar = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        } catch (RekeningnummerException e) {
            System.out.println(e.getMessage());
        }
        Zichtrekening zicht = null;
        try {
            zicht = new Zichtrekening("BE98 7654 3210 9876", 1000);
        } catch (RekeningnummerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Intrestpercentage van de spaarrekening: " + Spaarrekening.getIntrest());
        System.out.println("MaxKrediet van de zichtrekening is: " + zicht.getMaxKrediet());
        spaar.storten(600.0);
        zicht.storten(200.0);
        spaar.afhalen(25.0);
        System.out.println("Saldo van de spaarrekening: " + spaar.getSaldo());
        zicht.afhalen(50.0);
        System.out.println("Saldo van de zichtrekening: " + zicht.getSaldo());
        zicht.afhalen(2000);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 2000): " + zicht.getSaldo());
        spaar.afhalen(600.0);
        System.out.println("Saldo van de spaarrekening (na poging " + "afhalen 600): " + spaar.getSaldo());

        zicht.afhalen(1100);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 1100): " + zicht.getSaldo());
        zicht.setMaxKrediet(2000);
        System.out.println("MaxKrediet van de zichtrekening is: " + zicht.getMaxKrediet());
        zicht.afhalen(900);
        System.out.println("Saldo van de zichtrekening (na poging " + "afhalen 900): " + zicht.getSaldo());

        System.out.println("Intrest op de spaarrekening: " + spaar.berekenIntrest());
        System.out.println("Intrest op de zichtrekening: " + zicht.berekenIntrest());

    }
}
