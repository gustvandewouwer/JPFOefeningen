package be.vdab.lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ZoekSterrenbeeld {
    private static final Path PATH = Paths.get("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        System.out.print("woord:");
        try (Scanner scanner = new Scanner(System.in)) {
            String woord = scanner.next().toUpperCase();
            try (Stream<String> stream = Files.lines(PATH)) {
                stream.filter(sterrenbeeld -> sterrenbeeld.toUpperCase().contains(woord))
                        .forEach(sterrenbeeld -> System.out.println(sterrenbeeld));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
