package be.vdab;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Waarnemer waarnemer = new Waarnemer();

        System.out.println("Geef een temperatuur in (stop = 999):");

        int temperatuur = scanner.nextInt();

        while (temperatuur != 999) {
            waarnemer.registreer(temperatuur);
            System.out.println("Geef een temperatuur in (stop = 999):");
            temperatuur = scanner.nextInt();
        }

        System.out.println("Het aantal waarnemingen is: " + waarnemer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is: " + waarnemer.getMaxTemp());
    }
}