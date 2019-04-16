package be.vdab;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DateMain {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);
        LocalDate beginEuro = LocalDate.of(2002, 1, 1);
        System.out.println(beginEuro);
        LocalDate eindeBelgischeFrank = LocalDate.of(2001, Month.DECEMBER, 31);
        System.out.println(eindeBelgischeFrank);

        // Je kan de onderdelen van een LocalDate opvragen:
        System.out.println(eindeBelgischeFrank.getDayOfMonth());
        System.out.println(eindeBelgischeFrank.getDayOfYear());
        System.out.println(eindeBelgischeFrank.getDayOfWeek());
        System.out.println(eindeBelgischeFrank.getMonthValue());
        System.out.println(eindeBelgischeFrank.getMonth());
        System.out.println(eindeBelgischeFrank.lengthOfMonth());
        System.out.println(eindeBelgischeFrank.getYear());
        System.out.println(eindeBelgischeFrank.isLeapYear()); // false

        // Je kan op verschillende manieren LocalDates vergelijken:
//        LocalDate vandaag = LocalDate.now();
        LocalDate heden = LocalDate.now();
        System.out.println(vandaag.equals(heden));
//        LocalDate beginEuro = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(beginEuro.compareTo(heden));
        System.out.println(heden.isAfter(beginEuro));
        long dagenTussen = ChronoUnit.DAYS.between(beginEuro, heden);
        System.out.println(dagenTussen);
        long jarenTussen = ChronoUnit.YEARS.between(beginEuro, heden);
        System.out.println(jarenTussen);
        Period period = Period.between(beginEuro, vandaag);
        System.out.println("De euro is " + period.getYears() + " jaar, " + period.getMonths() + " maand en " + period.getDays() + " dagen geleden ingevoerd.");


        // Je kan berekeningen doen op een LocalDate:
//        LocalDate eindeBelgischeFrank = LocalDate.of(2001, 12, 31);
//        LocalDate beginEuro = eindeBelgischeFrank.plusDays(1);
        System.out.println(beginEuro);
        System.out.println(beginEuro.plusMonths(1));
        System.out.println(beginEuro.minusDays(1));
//        LocalDate vandaag = LocalDate.now();
        TemporalAdjuster adjuster = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate volgendeWoensdag = vandaag.with(adjuster);
        System.out.println(volgendeWoensdag);


        // Je kan een LocalDate op meerdere manieren opmaken:
//        LocalDate beginEuro = LocalDate.of(2002, 1, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(beginEuro.format(formatter));
        formatter = DateTimeFormatter.ofPattern("E d MMMM yyyy");
        System.out.println(beginEuro.format(formatter)); // di 1 januari 2002

        // Je kan een string omzetten naar een LocalDate:
        formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.print("datum (dag/maand/jaar):");
        String datumAlsString = scanner.next();
        LocalDate datum = LocalDate.parse(datumAlsString, formatter);
        System.out.println(datum);


        // LocalTime
        LocalTime nu = LocalTime.now();
        System.out.println(nu);
        LocalTime middag = LocalTime.of(12, 0);
        System.out.println(middag);

        // Je kan de onderdelen van een LocalTime opvragen:
        nu = LocalTime.now();
        System.out.println(nu.getHour());
        System.out.println(nu.getMinute());
        System.out.println(nu.getSecond());
        System.out.println(nu.getNano());

        // Je kan op verschillende manieren LocalTimes vergelijken:
        nu = LocalTime.now();
        LocalTime ietsLater = LocalTime.now();
        System.out.println(nu.equals(ietsLater));
        LocalTime straks = LocalTime.of(23, 59);
        System.out.println(nu.compareTo(straks));
        System.out.println(nu.isBefore(straks));
        long minutenTussen = ChronoUnit.MINUTES.between(nu, straks);
        System.out.println(minutenTussen);

        // Je kan berekeningen doen op een LocalTime:
        LocalTime juistVoorMiddag = LocalTime.of(11, 59);
        middag = juistVoorMiddag.plusMinutes(1);
        System.out.println(middag);

        //Je kan een LocalTime op meerdere manieren opmaken:
        middag = LocalTime.of(12, 0);
        formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(middag.format(formatter));
        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(middag.format(formatter));

        // Je kan een string omzetten naar een LocalTime:
        formatter = DateTimeFormatter.ofPattern("H:m");
        scanner = new Scanner(System.in);
        System.out.print("tijd (uren:minuten):");
        String tijdAlsString = scanner.next();
        LocalTime tijd = LocalTime.parse(tijdAlsString, formatter);
        System.out.println(tijd);

        // De class LocalDateTime is een combinatie van LocalDate en LocalTime:
        LocalDateTime nu2 = LocalDateTime.now();
        System.out.println(nu2);
        System.out.println(nu2.getDayOfMonth());
        System.out.println(nu2.getHour());
        LocalDateTime beginEuro2 = LocalDateTime.of(2002, 1, 1, 0, 0);
        System.out.println(beginEuro2);
        System.out.println(nu2.isAfter(beginEuro2));
        System.out.println(nu2.plusDays(1));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(nu2.format(formatter2));
    }
}
