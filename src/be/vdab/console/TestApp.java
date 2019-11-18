package be.vdab.console;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        System.out.println("BEGIN VERWERKING");
        System.out.println();

        Scanner scanner = new Scanner((System.in));

        String keuze = getKeuze(scanner);

        try {
            MerkProductenHelper.verwerkdata(keuze.toUpperCase().equals("F"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("EINDE VERWERKING");
    }

    private static String getKeuze(Scanner scanner) {
        System.out.println("Output naar file(F) of naar desktop(D)?");
        String keuze = scanner.next();
        while (!validKeuze(keuze)) {
            keuze = getKeuze(scanner);
        }
        return keuze;
    }

    private static boolean validKeuze(String keuze) {
        if (keuze.toUpperCase().equals("F") || keuze.toUpperCase().equals("D")) {
            return true;
        }
        return false;
    }

}
