package be.vdab.persistence;

import be.vdab.model.Parfum;
import be.vdab.model.Product;

import java.util.*;

public class BestellingImpl implements Bestelling {
    private List<Product> bestelling = new ArrayList<>();
    private static int productNummer = 1000;

    public BestellingImpl(List<Product> bestelling) {
        this.bestelling = bestelling;
    }

    public BestellingImpl() {
    }

    public List<Product> getBestelling() {
        return bestelling;
    }

    @Override
    public void voegProductToe(Product product) {
        product.setProductNummer(productNummer++);
        bestelling.add(product);
    }

    @Override
    public void sorteer() {
       Collections.sort(bestelling);
       toonProducten();
    }

    public void toonProducten() {
        for (Product product :
                bestelling) {
            System.out.println(product.toString());

        }
    }

    @Override
    public void sorteerOpMerk() {
        Collections.sort(bestelling, Product.sorteerOpMerkNaam);
        toonProducten();
    }

    @Override
    public void sorteerOpVolume() {
        Collections.sort(bestelling, Product.sorteerOpVolume);
        toonProducten();
    }

    @Override
    public void toonPerMerk(String merk) {
        for (Product product :
                bestelling) {
            if (product.getMerk().equals(merk)) {
                System.out.println(product.toString());
            }
        }

    }

    @Override
    public void toonGoedkopeProducten() {
        for (Product product :
                bestelling) {
            if (product.getPrijs() < 50.0D) {
                System.out.println(product.toString());
            }
        }

    }

    @Override
    public void toonParfums() {
        for (Product product :
                bestelling) {
            if (product instanceof Parfum) {
                System.out.println(product.toString());
            }
        }
    }

    @Override
    public Product zoekDuursteProduct() {
        Product duursteProduct = bestelling.get(0);
        for (Product product :
                bestelling) {
            if (product.getPrijs() > duursteProduct.getPrijs()) {
                duursteProduct = product;
            }
        }
        return duursteProduct;
    }

    @Override
    public double totalePrijs() {
        double totalePrijs = 0D;
        for (Product product :
                bestelling) {
            totalePrijs += product.getPrijs();
        }
        return totalePrijs;
    }
}
