package be.vdab.lambda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;

public class RunnableMain {
    private static final Path COUNTRIES_PATH = Paths.get("/data/countries.txt");
    private static final Path COUNTRIES_BACKUP_PATH = Paths.get("/data/countries.bak");
    private static final Path LANGUAGES_PATH = Paths.get("/data/languages.txt");
    private static final Path LANGUAGES_BACKUP_PATH = Paths.get("/data/languages.bak");

    private static void legeRegelsVerwijderen() {
        try {
            Files.deleteIfExists(COUNTRIES_BACKUP_PATH);
            Files.move(COUNTRIES_PATH, COUNTRIES_BACKUP_PATH);
            try (BufferedReader reader = Files.newBufferedReader(COUNTRIES_BACKUP_PATH);
                 BufferedWriter writer = Files.newBufferedWriter(COUNTRIES_PATH)) {
                for (String regel; (regel = reader.readLine()) != null;) {
                    if (!regel.isEmpty()) {
                        writer.write(regel);
                        writer.newLine();
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    private static void dubbelsVerwijderen() {
        Set<String> uniekeTalen = new LinkedHashSet<>();
        try {
            Files.deleteIfExists(LANGUAGES_BACKUP_PATH);
            Files.move(LANGUAGES_PATH, LANGUAGES_BACKUP_PATH);
            try (BufferedReader reader=Files.newBufferedReader(LANGUAGES_BACKUP_PATH)) {
                for (String regel; (regel = reader.readLine()) != null;) {
                    uniekeTalen.add(regel);
                }
            }
            try (PrintWriter writer = new PrintWriter(
                    Files.newBufferedWriter(LANGUAGES_PATH))) {
                for (String taal : uniekeTalen) {
                    writer.println(taal);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> legeRegelsVerwijderen()); // de method run heeft geen parameter
        t1.start();

        Thread t2 = new Thread(() -> dubbelsVerwijderen());
        t2.start();

//        Of korter:
//        new Thread(() -> legeRegelsVerwijderen()).start();
//        new Thread(() -> dubbelsVerwijderen()).start();
    }

}
