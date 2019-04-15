package be.vdab;

public class ArrayVanVijfIntegersMetIteraties {
    public static void main(String[] args) {
        int[] getallen = new int[5];
        int som = 0;
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int)(Math.random()*100) + 1;
            som = som + getallen[i];
        }
        float gemiddelde = (float) som/getallen.length;
        for (int i = 0; i < getallen.length; i++) {
            System.out.println(getallen[i]);
        }
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);
    }
}