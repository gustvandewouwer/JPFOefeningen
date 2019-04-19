package be.vdab.persistence;

import be.vdab.model.Product;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CreateFile {

    public static void writeToFile(List<Product> list) {
        try (BufferedWriter writer =  Files.newBufferedWriter(Paths.get("/data/merkproducten.dat"))){
            for (Product product :
                    list) {
                writer.write(product.toString() + "\n");
            }
//            writer.write("Jean");
        } catch(IOException ex){
            System.out.println(ex);
        }
    }
}
