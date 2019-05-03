package be.vdab.mytestpersoneel;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class BedrijfMain {

    public static void main(String[] args) {

        int index = 0;
        Set<Werknemer> werknemers = new TreeSet<>();

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider(null, new InDienstDatum(1, 2, 1980), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider(null, new InDienstDatum(1, 2, 1980), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Jos Vanboven", null, 15));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Jan Pauwels", new InDienstDatum(), 0));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Armand den Arbeider", new InDienstDatum(1, 2, 1980), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Armand den Arbeider", new InDienstDatum(1, 2, 1980), -20));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Bediende("Bob de Bediende", new InDienstDatum(1, 3, 1980), 1500));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Bediende("Bob de Bediende", new InDienstDatum(1, 3, 1980), -1500));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Bediende("Bob de Bediende", null, 1500));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Adam de Arbeider", new InDienstDatum(1, 2, 1979), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Bediende("Bert de Bediende", new InDienstDatum(1, 3, 1978), 1500));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Kaderlid("Karin het Kaderlid", new InDienstDatum(13, 2, 1977), 2500, "opperhoofd"));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Kaderlid("Karen nog een Kaderlid", new InDienstDatum(13, 2, 1977), 2500, ""));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Gust", new InDienstDatum(11, 2, 1977), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Gust", new InDienstDatum(12, 2, 1977), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Gust", new InDienstDatum(13, 2, 1977), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Toevoegen werknemer: " + ++index);
            werknemers.add(new Arbeider("Gust", new InDienstDatum(), 15));
        } catch (IllegalArgumentException | DatumException e) {
            System.out.println(e.getMessage());
        }


        for (Werknemer werknemer : werknemers) {
            System.out.println(werknemer);
        }

        System.out.println("SCHRIJF INHOUD SET WERKNEMERS NAAR FILE");
        try (ObjectOutputStream stream = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("h:\\personeel.dat")))) {
            stream.writeObject(werknemers);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("LEES INHOUD FILE WERKNEMERS IN SET");
        try (InputStream inputStream = Files.newInputStream(Paths.get("h:\\personeel.dat"));
             ObjectInputStream stream = new ObjectInputStream(inputStream)) {
            werknemers = (Set<Werknemer>) stream.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (Werknemer werknemer : werknemers) {
            werknemer.toon();
        }


//        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/data/naam.txt"))) {
//            writer.write("Jean");
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

    }

}
