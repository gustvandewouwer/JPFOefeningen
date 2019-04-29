package be.vdab.lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SterrenbeeldenMain {
    private static final Path PATH = Paths.get("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(PATH)) {
            stream.forEach(beeld -> System.out.println(beeld.toUpperCase()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
