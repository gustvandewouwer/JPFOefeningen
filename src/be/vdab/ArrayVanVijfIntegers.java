package be.vdab;

public class ArrayVanVijfIntegers {
    public static void main(String[] args) {
        int[] getallen = new int[5];
        getallen[0] = (int)(Math.random()*100) + 1;
        getallen[1] = (int)(Math.random()*100) + 1;
        getallen[2] = (int)(Math.random()*100) + 1;
        getallen[3] = (int)(Math.random()*100) + 1;
        getallen[4] = (int)(Math.random()*100) + 1;
        int som = getallen[0] + getallen[1] + getallen[2] +
                getallen[3] + getallen[4];
        float gemiddelde = (float)som / getallen.length;
        System.out.println(getallen[0]);
        System.out.println(getallen[1]);
        System.out.println(getallen[2]);
        System.out.println(getallen[3]);
        System.out.println(getallen[4]);
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);
    }
}