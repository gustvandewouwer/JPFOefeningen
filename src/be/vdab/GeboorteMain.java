package be.vdab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GeboorteMain {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.print("geboortedatum (dag/maand/jaar):");
        String geboorteAlsString = scanner.next();
        LocalDate geboorte = LocalDate.parse(geboorteAlsString, formatter);
        System.out.println(geboorte.getDayOfWeek());
        System.out.println(
                ChronoUnit.YEARS.between(geboorte, LocalDate.now()));
    }
}
