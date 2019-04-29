package be.vdab.lambda;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaMain {
    private static final Path PATH = Paths.get("/data/languages.txt");
    private static final Path PATHDATA = Paths.get("/data");

    public static void main(String[] args) {
        EvenGetallen evenGetallen = getal -> getal % 2 == 0; // EventGetallen is een interface
        System.out.println(evenGetallen.isEven(7));

        String[] groenten = {"tomaat", "sla", "ui", "prei"};

        System.out.println("Sortering van de groenten");
        Arrays.sort(groenten, (groente1, groente2) -> -groente1.compareTo(groente2)); // sortering desc van de groenten
        System.out.println(Arrays.toString(groenten));

        Arrays.sort(groenten, sorteerOpNaam); // sortering desc van de groenten
        System.out.println(Arrays.toString(groenten));

        String[] arrGroenten = {"tomaat", "sla", "ui", "prei"};
        Stream<String> stream = Arrays.stream(arrGroenten);
        stream.forEach(groente -> System.out.println(groente));

        List<String> groenten2 = Arrays.asList("tomaat", "sla", "ui", "prei");
        groenten2.stream()
                .forEach(groente -> System.out.println(groente));

        Set<Integer> heiligeGetallen = new LinkedHashSet<>();
        heiligeGetallen.add(1);
        heiligeGetallen.add(3);
        heiligeGetallen.add(4);
        heiligeGetallen.add(7);
        heiligeGetallen.stream()
                .forEach(getal -> System.out.println(getal));

        Map<String, String> talen = new LinkedHashMap<>();
        talen.put("NL", "Nederlands");
        talen.put("FR", "Frans");
        talen.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ':' +
                        entry.getValue()));

        "Lambdafun".chars()
                .forEach(unicode -> System.out.println((char) unicode));

        try (Stream<String> stream2 = Files.lines(PATH)) {
            stream2.forEach(regel -> System.out.println(regel));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }

        try (Stream<Path> stream3 = Files.list(PATHDATA)) {
            stream3.forEach(entry -> System.out.println(entry.getFileName()));
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }

        Stream.of("Adam", "Eva")
                .forEach(naam -> System.out.println(naam));

        Stream.iterate(1, vorigGetal -> vorigGetal + 2)
                .limit(10)
                .forEach(onevenGetal -> System.out.println(onevenGetal));

        IntStream.rangeClosed(1, 10)
                .forEach(getal -> System.out.println(getal));
        IntStream.range(1, 10)
                .forEach(getal -> System.out.println(getal));

        Stream<String> groenten3 = Stream.of("sla", "wortel", "kool", "biet");
        Stream<String> stream3 = groenten3.filter(groente -> groente.length() == 4);
        stream3.forEach(groenteMet4Letters -> System.out.println(groenteMet4Letters));

        // Of korter
        Stream.of("sla", "wortel", "kool", "biet")
                .filter(groente -> groente.length() == 4)
                .forEach(groenteMet4Letters -> System.out.println(groenteMet4Letters));

        Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .forEach(groente -> System.out.println(groente));

        System.out.println("Sortering op lengte van klein naar groot");
        Stream.of("sla", "wortel", "kool", "biet")
                .sorted((groente1, groente2) -> groente1.length() - groente2.length())
                .forEach(groente -> System.out.println(groente));

//        Je kan ook sorteren op meerdere criteria. Je sorteert als voorbeeld de groenten op het aantal tekens.
//        Je sorteert groenten met hetzelfde aantal tekens alfabetisch.
        System.out.println("Sortering op lengte en alfabetisch");
        Comparator<String> comparator =
                (groente1, groente2) -> groente1.length() - groente2.length();
        comparator = comparator.thenComparing(
                (groente1, groente2) -> groente1.compareTo(groente2));
        Stream.of("sla", "wortel", "kool", "biet")
                .sorted(comparator)
                .forEach(groente -> System.out.println(groente));

        System.out.println("Toon groenten met lengte = 4, gesorteerd");
        Stream.of("sla", "wortel", "kool", "biet")
                .filter(groente -> groente.length() == 4)
                .sorted()
                .forEach(groente -> System.out.println(groente));

        System.out.println("Toon unieke voorkomens (geen dubbels)");
        Stream.of("sla", "kool", "wortel", "biet", "sla")
                .distinct()
                .forEach(groente -> System.out.println(groente));

        System.out.println("Toon de lengte van elke groente");
        Stream.of("sla", "wortel", "kool", "biet")
                .map(groente -> groente.length())
                .forEach(lengte -> System.out.println(lengte));

        System.out.println("Allmatch - true als alle elementen matchen");
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .allMatch(groente -> groente.length() == 4));

        System.out.println("Anymatch - true als één element matcht");
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .anyMatch(groente -> groente.length() == 4));

        System.out.println("Collectors.toList()");
        System.out.println(gesorteerdeGroentenToList());

        System.out.println("Collectors.toSet()");
        System.out.println(gesorteerdeGroentenToSet());

        System.out.println("Collectors.groupingBy - Groeperen op een waarde");
        Map<Integer, List<String>> groentenPerLengte =
                Stream.of("sla", "kool", "wortel", "biet")
                        .collect(Collectors.groupingBy(groente -> groente.length()));

        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.print(entry.getKey());

                    entry.getValue().stream()
                            .forEach(groente -> System.out.print(groente));
                    System.out.println();
                });

        System.out.println("Collectors.joining - waarden worden in één string gezet");
        System.out.println(Stream.of("sla", "wortel", "kool", "biet")
                .collect(Collectors.joining(", ")));

        System.out.println("count() - tellen aantal");
        System.out.println(Stream.of("sla", "wortel", "kool", "biet").count());

        System.out.println("sum() - sommatie");
        IntStream stream4 = IntStream.of(1, 3, 4, 7);
        System.out.println(stream4.sum());

        System.out.println("min() - kleinste waarde"); // max() en average() bestaan ook
        IntStream stream5 = IntStream.of(1, 3, 4, 7);
        stream5.min().ifPresent(kleinste -> System.out.println(kleinste));

        System.out.println("mapToInt() - omzetten van een stream van strings naar een stream van ints");
        System.out.println(
                Stream.of("sla", "wortel", "kool", "biet")
                        .mapToInt(groente -> groente.length())
                        .sum());

        System.out.println("min() - kleinste BigDecimal");
        Stream.of(
                BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .min((getal1, getal2) -> getal1.compareTo(getal2))
                .ifPresent(kleinste -> System.out.println(kleinste));

        System.out.println("reduce() - waarden van een stream reduceren tot één waarde");
        System.out.println(
                Stream.of(
                        BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                        .reduce(BigDecimal.ZERO, (vorigeSom, getal) -> vorigeSom.add(getal)));

        System.out.println("reduce() - een aleternatieve manier");
        Stream.of(
                BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .reduce((getal1, getal2) -> getal1.add(getal2))
                .ifPresent(som -> System.out.println(som));

        System.out.println("reduce() - een aleternatieve manier");
        Stream.of(
                BigDecimal.valueOf(1.1), BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.5))
                .reduce((vorigeSom, getal) -> {
                    System.out.println("V: " + vorigeSom);
                    System.out.println("G: " + getal);
                    return getal.add(vorigeSom);
                })
                .ifPresent(som -> System.out.println(som));

        System.out.println("flatMap() - streams samenvoegen");
        Stream.of(Stream.of("Joe", "Jack"), Stream.of("William", "Averell"))
                .flatMap(stream6 -> stream6)
                .forEach(voornaam -> System.out.println(voornaam));

        System.out.println("flatMap() - unieke woorden");
        Stream.of("The lord of the rings", "The hobbit")
                .map(titel -> titel.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .map(woord -> woord.toLowerCase())
                .distinct()
                .sorted()
                .forEach(woord -> System.out.println(woord));
    }

    public static List<String> gesorteerdeGroentenToList() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .sorted()
                .collect(Collectors.toList());
    }

    public static Set<String> gesorteerdeGroentenToSet() {
        return Stream.of("sla", "wortel", "kool", "biet")
                .collect(Collectors.toSet());
    }

    public static Comparator<String> sorteerOpNaam = new Comparator<String>() {

        public int compare(String groente1, String groente2) {
            return -groente1.compareTo(groente2);
        }

    };
}