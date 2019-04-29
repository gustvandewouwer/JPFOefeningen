package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LaatsteLand {
    private static final Path PATH = Paths.get("/data/landcodes.txt");

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(PATH)) {
            stream.map(regel -> regel.substring(regel.indexOf(' ') + 1))
                    .max((naam1, naam2) -> naam1.compareToIgnoreCase(naam2))
                    .ifPresent(grootsteNaam -> System.out.println(grootsteNaam));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
