package be.vdab.mytestpersoneel;

import be.vdab.Punt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BedrijfMain {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        Set<Werknemer> werknemers = new TreeSet<>();
//        List<Werknemer> werknemers = new ArrayList<>();

        try {
            werknemers.add(new Arbeider("Anna", new WerknemersDatum(1, 2, 1980), 15));
            werknemers.add(new Bediende("Brenda", new WerknemersDatum(1, 3, 1980), 1500));
            werknemers.add(new Arbeider("Carla", new WerknemersDatum(1, 2, 1979), 15));
            werknemers.add(new Bediende("Daniella", new WerknemersDatum(1, 3, 1978), 1500));
            werknemers.add(new Kaderlid("Els", new WerknemersDatum(13, 2, 1977), 2500, "chef"));
        } catch (WerknemerException e) {
            System.out.println(e.getMessage());
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer);
        }

        System.out.println("SCHRIJF INHOUD SET WERKNAMERS NAAR FILE");
        try (ObjectOutputStream stream = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("h:\\personeel.dat")))) {
            stream.writeObject(werknemers);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        System.out.println("LEES FILE WERKNEMERS NAAR SET");
        try (InputStream inputStream = Files.newInputStream(Paths.get("h:\\personeel.dat"));
             ObjectInputStream stream = new ObjectInputStream(inputStream)) {
            werknemers = (Set<Werknemer>) stream.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer);
        }


//        try {
//            fos = new FileOutputStream("h:\\personeel.dat");
//            oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(werknemers);
//        } catch (IOException ex) {
//            System.err.println(ex.getMessage());
//        } finally {
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException ex) {
//                    System.err.println(ex.getMessage());
//                }
//            }
//        }

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/data/naam.txt"))) {
            writer.write("Jean");
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
