package be.vdab.console;

import be.vdab.model.Product;
import be.vdab.persistence.Bestelling;
import be.vdab.persistence.BestellingImpl;
import be.vdab.persistence.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class MerkProductenHelper {

    public static void verwerkdata(boolean outputToFile) throws FileNotFoundException {
        System.out.println("VERWERKING MET OUTPUT TO FILE: " + outputToFile);
        System.out.println("==============================");

        // Store current System.out before assigning a new value
        PrintStream console = System.out;

        if (outputToFile) {
            // Creating a File object that represents the disk file.
            PrintStream o = new PrintStream(new File("/data/merkproducten.dat"));

            // Assign o to output stream
            System.setOut(o);
        }

        System.out.printf("Oplossing van %s %s\n", "GUST VAN DE WOUWER ", "FUNCTIE");

        Bestelling bestelling = new BestellingImpl();
        List<Product> lijst = Data.getData();
//        for (Product artikel : lijst) {
//            bestelling.voegProductToe(artikel);
//        }

//        lijst.forEach(artikel -> bestelling.voegProductToe(artikel));
        lijst.forEach(bestelling::voegProductToe);

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

        if (outputToFile) {
            // Use stored value for output stream
            System.setOut(console);
        }
    }

}
