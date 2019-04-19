package be.vdab.console;

import be.vdab.model.Product;
import be.vdab.persistence.Bestelling;
import be.vdab.persistence.BestellingImpl;
import be.vdab.persistence.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        System.out.println("BEGIN VERWERKING");
        System.out.println();

        try {
            verwerkdata(true);
            verwerkdata(false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("EINDE VERWERKING");

    }

    private static void verwerkdata(boolean screen) throws FileNotFoundException {

        // Store current System.out before assigning a new value
        PrintStream console = System.out;

        if (!screen) {
            // Creating a File object that represents the disk file.
            PrintStream o = new PrintStream(new File("/data/merkproducten.dat"));

            // Assign o to output stream
            System.setOut(o);

//            System.out.println("This will be written to the text file");

        }


        Bestelling bestelling = null;
        System.out.printf("Oplossing van %s %s\n", "GUST VAN DE WOUWER ", "FUNCTIE");

        bestelling = new BestellingImpl();
        List<Product> lijst = Data.getData();

        for (Product artikel : lijst) {
            bestelling.voegProductToe(artikel);
        }

        System.out.println("Lijst gesorteerd op natuurlijke volgorde: ");
        bestelling.sorteer();

        System.out.println("\nLijst gesorteerd op merknaam: ");
        bestelling.sorteerOpMerk();

        System.out.println("\nLijst gesorteerd op volume: ");
        bestelling.sorteerOpVolume();

        System.out.println("\nVan het merk Georgio Armani:");
        bestelling.toonPerMerk("Georgio Armani");

        System.out.println("\nAlle Parfums:");
        bestelling.toonParfums();

        System.out.println("\nAlle producten onder €50; ");
        bestelling.toonGoedkopeProducten();

        Product product = bestelling.zoekDuursteProduct();
        System.out.println("\nDuurste product:\n" + product);

        System.out.printf("\nTotale prijs: €%.2f", bestelling.totalePrijs());
//            CreateFile.writeToFile(((BestellingImpl) bestelling).getBestelling());

        if (!screen) {
            // Use stored value for output stream
            System.setOut(console);
//            System.out.println("This will be written on the console!");
        }
    }
}
