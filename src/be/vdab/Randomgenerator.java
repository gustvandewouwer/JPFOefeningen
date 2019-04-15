package be.vdab;

public class Randomgenerator {
    public static void main(String[] args) {
        int[] getallen = new int[100]; //automatische initialisatie op 0
        for(int i=0; i<10_000; i++) {
            int randGetal = (int)(Math.random()*100 + 1 );
            getallen[randGetal-1]++;
        }
        for(int i=0; i<getallen.length; i++) {
            System.out.println("getal " + (i+1) + " : " + getallen[i]);
        }
    }
}