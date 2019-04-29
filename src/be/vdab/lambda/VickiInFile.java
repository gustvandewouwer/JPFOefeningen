package be.vdab.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class VickiInFile {
    private static final Path PATH = Paths.get("/data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(PATH)) {
            System.out.println(
                    stream.map(regel -> regel.split(";")[0])
                            .anyMatch(voornaam -> "Vicki".equals(voornaam))
                            ? "komt voor" : "komt niet voor");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
