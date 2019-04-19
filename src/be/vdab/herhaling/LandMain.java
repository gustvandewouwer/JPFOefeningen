package be.vdab.herhaling;

import java.math.BigDecimal;
import java.util.*;

public class LandMain {
    public static void main(String[] args) {
        Set<Land> landen = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef landcode (stop om te eindigen)");
        String landCode = scanner.next();
        BigDecimal aantalInwoners = BigDecimal.ZERO;

        while (!landCode.equals("stop")) {
            System.out.println("Geef aantal inwoners: ");
            aantalInwoners = scanner.nextBigDecimal();
            landen.add(new Land(landCode, aantalInwoners));

            System.out.println("Geef landcode (stop om te eindigen)");
            landCode = scanner.next();
        }

        for (Land land : landen
             ) {
            System.out.println(land.getLandCode() + " " + land.getAantalInwoners());
        }

    }
}
