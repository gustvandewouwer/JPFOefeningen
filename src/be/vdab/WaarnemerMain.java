package be.vdab;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {
        Waarnemer thermometer = new Waarnemer();
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Geef een temperatuur in (stop = 999):");
        int temperatuur = scanner.nextInt();
        while (temperatuur != 999) {
            thermometer.registreer(temperatuur);
            System.out.println("Geef een temperatuur in:");
            temperatuur = scanner.nextInt();
        }
        System.out.println("Het aantal waarnemingen is: " +
                thermometer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is: " +
                thermometer.getMaxTemp());
        System.out.println("De laagste temperatuur is: " +
                thermometer.getMinTemp());
        System.out.println("De gemiddelde temperatuur is: " +
                thermometer.getGemTemp());
    }
}