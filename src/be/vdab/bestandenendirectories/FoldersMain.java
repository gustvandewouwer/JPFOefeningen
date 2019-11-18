package be.vdab.bestandenendirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FoldersMain {
    public static void main(String[] args) {
        Path afbeeldingen = Paths.get("/data/afbeeldingen");
        System.out.println(afbeeldingen.getParent());
        Path huidigeDirectory = Paths.get("plaatselijk");
        System.out.println(huidigeDirectory.toAbsolutePath());

        System.out.println(Files.exists(Paths.get("/data")));

        Path data = Paths.get("/data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));

//        try {
//            Files.createDirectory(Paths.get("/data/teksten"));
//
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }

        try {
            Files.move(Paths.get("/data/afbeeldingen"), Paths.get("/data/images"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Paths.get("/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println(Files.size(Paths.get("/data/images/duimop.jpg")));

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.copy(Paths.get("/data/images/duimop.jpg"), Paths.get("/data/images/thumbup.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.move(Paths.get("/data/images/thumbup.jpg"), Paths.get("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Paths.get("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
