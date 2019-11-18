package be.vdab.model;

import java.util.Comparator;
import java.util.Formatter;
import java.util.Objects;

public abstract class Product implements Comparable<Product> {
    private int productNummer;
    private String merk;
    private String naam;
    private int volume;
    private double prijs;

    public Product(int productNummer, String merk, String naam, int volume, double prijs) {
        this.productNummer = productNummer;
        this.merk = merk;
        this.naam = naam;
        this.volume = volume;
        this.prijs = prijs;
    }

    public Product() {
    }

    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getProductCode() {
        StringBuilder sb = new StringBuilder(getMerk().substring(0, 3).toUpperCase().replace(" ", "_"));
        sb.append(getNaam().substring(0, 3).toUpperCase().replace(" ", "_"));
        sb.append(getVolume());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productNummer == product.productNummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNummer);
    }

//    Methode voluit geschreven
    public static Comparator<Product> sorteerOpMerkNaam1 = new Comparator<Product>() {

        public int compare(Product product1, Product product2) {

            String merknaam1 = product1.getMerk().toUpperCase();
            String merknaam2 = product2.getMerk().toUpperCase();

            //ascending order
            return merknaam1.compareTo(merknaam2);
        }
    };

//    Methode met gebruik van lambda
    public static Comparator<Product> sorteerOpMerkNaam2 = (product1, product2) -> {

        String merknaam1 = product1.getMerk();
        String merknaam2 = product2.getMerk();

        //ascending order
        return merknaam1.compareTo(merknaam2);
    };

//    Meest compacte methode
    public static Comparator<Product> sorteerOpMerkNaam(){
        return Comparator.comparing(Product::getMerk);
    }

    public static Comparator<Product> sorteerOpVolume1 = (product1, product2) -> {

        int volume1 = product1.getVolume();
        int volume2 = product2.getVolume();

        //ascending order
        return volume1 - volume2;
    };

//    Meest compacte methode
    public static Comparator<Product> sorteerOpVolume(){
        return Comparator.comparingInt(Product::getVolume);
    }

    @Override
    public String toString() {
        // FORMAT gebruiken
        StringBuilder sbuf = new StringBuilder();
        Formatter fmt = new Formatter(sbuf);
        fmt.format("%d Merk: %-25s Naam: %-25s Volume: %3dml  Prijs: %.2f Code: %-9s", productNummer, merk, naam, volume, prijs, getProductCode());
        return sbuf.toString();

//        return productNummer + " Merk: " + merk + " Naam: " + naam + " Volume: " + volume + "ml" + " Prijs: " + prijs + " Code: " +
//                getProductCode();
    }

    @Override
    public int compareTo(Product o) {
        return productNummer - o.productNummer;
    }
}
