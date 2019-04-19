package be.vdab;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PuntMain {
    public static void main(String[] args) {
        // SCHRIJVEN VAN OBJECTEN IN EEN FILE
//        try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(Paths.get("/data/punt.ser")))) {
//            stream.writeObject(new Punt(10, 20));
//
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        // LEZEN VAN OBJECTEN UIT EEN FILE
        try (InputStream inputStream = Files.newInputStream(Paths.get("/data/punt.ser"));
             ObjectInputStream stream = new ObjectInputStream(inputStream)) {
            Punt punt = (Punt) stream.readObject();
            System.out.println(punt);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
