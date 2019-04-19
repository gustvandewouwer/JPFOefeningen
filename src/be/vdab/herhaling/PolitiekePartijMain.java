package be.vdab.herhaling;

public class PolitiekePartijMain {
    public static void main(String[] args) {
        PolitiekePartij politiekePartij = new PolitiekePartij("vld");
        Politieker politieker = new Politieker("Gust", "VDW" ,politiekePartij);
        System.out.println(politieker.toString());

    }
}
