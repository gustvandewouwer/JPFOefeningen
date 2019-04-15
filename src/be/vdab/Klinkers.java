package be.vdab;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik een zin:");
        String zin = scanner.nextLine().toLowerCase() ;
        int aantal = 0;
        for (int i=0; i < zin.length(); i++) {
            char letter = zin.charAt(i);
// if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
// aantal++;
// }
//andere manier
            if ("aeiou".indexOf(letter)> -1)
                aantal++;
        }
        System.out.println("Aantal klinkers: " + aantal);
    }
}
