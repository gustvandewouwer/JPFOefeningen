package be.vdab.gastenboek;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GastenboekManager {
    private final static Path PAD = Paths.get("/data/gastenboek.ser");

    public void schrijf(Gastenboek gastenboek) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                Files.newOutputStream(PAD))) {
            stream.writeObject(gastenboek);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    public Gastenboek lees() {
        if (Files.exists(PAD)) {
            try (ObjectInputStream stream = new ObjectInputStream(
                    Files.newInputStream(PAD))) {
                return (Gastenboek) stream.readObject();
            } catch (Exception ex) {
                System.err.println(ex);
                return null;
            }
        }
        return new Gastenboek();
    }
}