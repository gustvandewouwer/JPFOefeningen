package be.vdab.bestandenendirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class BestandenMain {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/data/naam.txt"))) {
            writer.write("Jean\n");
            writer.write("Gust\n");
            writer.write("Sus\n");
            writer.write("Marianne\n");
            writer.write("Ingrid\n");
            writer.write("Veronique\n");
            writer.write("Jos\n");
            writer.write("Stephan\n");
        } catch (IOException ex) {
            System.out.println(ex);
        }


        System.out.println("LEES CSV FILE");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("/data/insecten1.csv"))) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("SCHRIJF GETALLEN NAAR FILE");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("/data/getallen.txt")))) {
            writer.println(10);
            writer.println(100);
            writer.println(1000);
            writer.println(10000);
            writer.println(100000);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        System.out.println("SCHRIJF TEKST NAAR FILE");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("/data/teksten.txt")))) {
            writer.println("zerzer");
            writer.println("sdlfkmdflgf");
            writer.println("sdfsgfgngdh,h");
            writer.println("dfgghzrzerrthth");
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}