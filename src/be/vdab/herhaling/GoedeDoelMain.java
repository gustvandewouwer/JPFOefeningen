package be.vdab.herhaling;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoedeDoelMain {
    public static void main(String[] args) {
        GoedeDoel goedeDoel = new GoedeDoel("Rode Kruis");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef bedrag (0=stoppen)");
        BigDecimal db = scanner.nextBigDecimal();
        while (db.compareTo(BigDecimal.ZERO) != 0) {
            goedeDoel.stort(db);
            System.out.println("Geef bedrag (0=stoppen)");
            db = scanner.nextBigDecimal();

        }

        System.out.println("Totaal gestorte bedragen voor " + goedeDoel.getNaam() + "= " + goedeDoel.getBedrag());
    }
}
