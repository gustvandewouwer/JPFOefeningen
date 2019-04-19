package be.vdab.herhaling;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersoonManager {
    private final static Path PAD = Paths.get("/data/personen.ser");

    public void save(Personen personen) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                Files.newOutputStream(PAD))) {
            stream.writeObject(personen);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public Personen load() {
        if (Files.exists(PAD)) {
            try (ObjectInputStream stream = new ObjectInputStream(
                    Files.newInputStream(PAD))) {
                return (Personen) stream.readObject();
            } catch (Exception ex) {
                System.err.println(ex);
                return null;
            }
        }
        return new Personen();
    }
}
