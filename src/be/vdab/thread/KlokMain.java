package be.vdab.thread;

import java.util.Scanner;

public class KlokMain {
    public static void main(String[] args) {
        Klok klok = new Klok();
        Thread thread = new Thread(klok);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // deze method wacht tot de gebruiker Enter drukt
        thread.interrupt(); // er wordt dan een InterruptedException gethrowed
    }
}
