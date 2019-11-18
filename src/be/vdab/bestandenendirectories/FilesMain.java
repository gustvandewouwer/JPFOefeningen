package be.vdab.bestandenendirectories;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) {
        try {
            List<String> regels = Files.readAllLines(Paths.get("/data/insecten1.csv"));
            for (String regel : regels) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get("/data/insecten1.csv"));
            try {
//                String regel = reader.readLine();
//                while (regel != null) {
//                    System.out.println(regel);
//                    regel = reader.readLine();
//
//                }
                for (String regel; (regel = reader.readLine()) != null; ) {
                    System.out.println(regel);
                }
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                reader.close();

            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // TEKST LEZEN
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("/data/insecten1.csv"))) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // TEKST SCHRIJVEN
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/data/naam.txt"))) {
            writer.write("Jean");
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // GETALLEN SCHRIJVEN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik getallen. Tik 0 om te stoppen:");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("/data/getallen.txt")))) {
            for (int getal; (getal = scanner.nextInt()) != 0; ) {
                writer.println(getal);

            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // GETALLEN LEZEN
        try (Scanner scanner2 = new Scanner(Files.newBufferedReader(Paths.get("/data/getallen.txt")))) {
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextInt());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // BINAIRE BESTANDEN
        try (InputStream input = Files.newInputStream(Paths.get("/data/images/duimop.jpg"));
             OutputStream output = Files.newOutputStream(Paths.get("/data/images/thumbup.jpg"))) {
            for (int eenByte; (eenByte = input.read()) != -1; ) {
                output.write(eenByte);

            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        // DE INHOUD VAN EEN DIRECTORY OPVRAGEN
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("/data"))) {
            for (Path path : stream) {
                System.out.print(path);
                System.out.println(Files.isDirectory(path) ? ":directory" : ":bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

