package be.vdab;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        while (lotto[lotto.length - 1] == 0) {
            int getal = (int) (Math.random() * 42 + 1);
            int index = 0;
            while (lotto[index] != getal && lotto[index] != 0) {
                index++;
            }
            if (lotto[index] == 0) {
                lotto[index] = getal;
            }
        }
// er zijn nu 7 verschillende getallen gevonden
// de eerste 6 worden gesorteerd, het zevende is het reservegetal
        int tempGetal;
        for (int i=0; i<lotto.length -2; i++) {
            for (int j=i+1; j<lotto.length -1; j++) {
                if (lotto[j] < lotto[i]) {
                    tempGetal = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = tempGetal;
                }
            }
        }
        System.out.println("De winnende lotto getallen zijn: ");
        for(int i=0; i < lotto.length -1; i++) {
            System.out.print(lotto[i]+ "\t");
        }
        System.out.println("\nHet reservegetal is: " +
                lotto[lotto.length - 1] );
    }
}