package be.vdab;

import java.util.Scanner;

public class RekenaarMain {
    public static void main(String[] args) {
        Rekenaar rek = new Rekenaar("17 + 38 * 2 - 22");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek); //toString() wordt hier getoond
//lege expressie
        rek.setTekst("");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
//andere expressie
        rek.setTekst("7 - 5 * 10 / 0 ");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
//expressie laten ingeven door gebruiker
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef zelf een te berekenen expressie: ");
        String expressie = scanner.nextLine();
        rek.setTekst(expressie);
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
    }
}