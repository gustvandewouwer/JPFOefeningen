package be.vdab.herhaling;

public class BreukMain {
    public static void main(String[] args) {
        try {
            Breuk breuk = new Breuk(10, 5);
            System.out.println(breuk);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Breuk breuk1 = new Breuk(10, 0);
            System.out.println(breuk1.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
