package be.vdab;

import java.util.Arrays;

public class VoorbeeldProcedureB {
    public static void main(String[] args) {
        int[] getallen = new int[50];
        // GENEREREN van 50 willekeurige getallen
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }
        // Toon ONGESORTEERD resultaat
        toonTabel(getallen, "Ongesorteerd");
        // SORTEREN van de 50 getallen
        Arrays.sort(getallen); //
        // Toon GESORTEERD resultaat
        toonTabel(getallen, "Gesorteerd");
    }

    private static void toonTabel(int[] teTonenTabel, String titel) {
        System.out.println("\n" + titel);
        for (int i = 0; i < teTonenTabel.length; i++) {
            System.out.print(teTonenTabel[i] + "\t");
        }
    }
}

