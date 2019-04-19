package be.vdab.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InsectenLezerThread extends Thread {
    private static final BigDecimal MAXIMUM = BigDecimal.valueOf(3);

    private final Path pad;
    private final PrintStream stream;

    public InsectenLezerThread(String bestand, PrintStream stream) {
        this.pad = Paths.get(bestand);
        this.stream = stream;
    }

    @Override
    public void run() {
        try (BufferedReader reader = Files.newBufferedReader(pad)) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                String[] onderdelen = regel.split(";");
                BigDecimal prijs = new BigDecimal(onderdelen[1]);
                if (prijs.compareTo(MAXIMUM) <= 0) {
                    stream.println(pad.getFileName() + ":" + regel);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}