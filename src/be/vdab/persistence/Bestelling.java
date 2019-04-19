package be.vdab.persistence;

import be.vdab.model.Product;

public interface Bestelling extends Berekenbaar {
    void voegProductToe(Product product);
    void sorteer();
    void sorteerOpMerk();
    void sorteerOpVolume();
    void toonPerMerk(String s);
    void toonGoedkopeProducten();
    void toonParfums();
    Product zoekDuursteProduct();
}
