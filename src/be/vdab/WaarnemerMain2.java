package be.vdab;

import java.util.Scanner;

public class WaarnemerMain2 {
    public static void main(String[] args) {

        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int aantalWaarnemingen = 0;
        double somTemp = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een temperatuur in (stop = 999):");

        int temperatuur = scanner.nextInt();

        while (temperatuur != 999) {
            somTemp = somTemp + temperatuur;
            aantalWaarnemingen =  aantalWaarnemingen + 1;

            if (temperatuur > maxTemp) {
                maxTemp = temperatuur;
            }
            if (temperatuur < minTemp) {
                minTemp = temperatuur;
            }

            System.out.println("Geef een temperatuur in (stop = 999):");
            temperatuur = scanner.nextInt();
        }

        System.out.println("Het aantal waarnemingen is: " + aantalWaarnemingen);

        if (aantalWaarnemingen > 0) {
            System.out.println("De hoogste temperatuur is: " + maxTemp);
            System.out.println("De laagste temperatuur is: " + minTemp);
            System.out.println("De gemiddelde temperatuur is: " + somTemp / aantalWaarnemingen);
        } else {
            System.out.println("De hoogste temperatuur is: " + 0);
            System.out.println("De laagste temperatuur is: " + 0);
            System.out.println("De gemiddelde temperatuur is: " + 0);
        }
    }
}