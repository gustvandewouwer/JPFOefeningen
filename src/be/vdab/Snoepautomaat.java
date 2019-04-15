package be.vdab;

public class Snoepautomaat {
    public static void main(String[] args) {
        int ingave = 2;
        double kost = 0.42;
        int terug = ingave * 100 - (int)(kost*100); //in centen uitgedrukt
        System.out.println("Kost van " + kost + " euro, en ingave van " +
                ingave + " euro" );
        System.out.println("Automaat geeft " + terug + " cent(en) terug");
        int munt100, munt50, munt20, munt10, munt5, munt2, munt1;
        munt100 = terug / 100;
        terug -=munt100 * 100;
        munt50 = terug / 50;
        terug -= munt50 * 50;
        munt20 = terug / 20;
        terug -= munt20 * 20;
        munt10 = terug / 10;
        terug -= munt10 * 10;
        munt5 = terug / 5;
        terug -= munt5 * 5;
        munt2 = terug / 2;
        terug -= munt2 * 2;
        munt1 = terug;
        System.out.println("Munten van 1 EUR : " + munt100);
        System.out.println("Munten van 0,50 EUR: " + munt50);
        System.out.println("Munten van 0,20 EUR: " + munt20);
        System.out.println("Munten van 0,10 EUR: " + munt10);
        System.out.println("Munten van 0,05 EUR: " + munt5);
        System.out.println("Munten van 0,02 EUR: " + munt2);
        System.out.println("Munten van 0,01 EUR: " + munt1);
    }
}