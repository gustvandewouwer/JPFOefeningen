package be.vdab;

public class Randomgenerator2 {
    public static void main(String[] args) {
        int[] getallen = new int[100];
        for(int i = 0; i < getallen.length; i++) {
            getallen[i] = (int)(Math.random()*1000 + 1);
        }
// SORTEREN van de 100 getallen
        for(int pos = 0; pos < getallen.length - 1; pos++) {
            for(int vgl = pos+1; vgl < getallen.length; vgl++) {
                if (getallen[pos] > getallen[vgl]) {
                    int tempGetal = getallen[pos];
                    getallen[pos] = getallen[vgl];
                    getallen[vgl] = tempGetal;
                }
            }
        }
        for (int i = 0; i<getallen.length; i++) {
            System.out.print(getallen[i] + "\t") ;
        }
    }
}