package be.vdab.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnevenGetallen {
    public static void main(String[] args) {
        List<Integer> getallen = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            for (int getal; (getal = scanner.nextInt()) != 0;) {
                getallen.add(getal);
            }

            getallen.stream()
                    .filter(getal -> getal % 2 == 1) // oneven getallen
                    .sorted((getal1, getal2) -> getal2 - getal1) // desc volgorde
                    .forEach(getal -> System.out.println(getal));
        }
    }
}
