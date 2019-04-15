package be.vdab;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHoeveel huisdieren heb je?");
        int huisdieren = scanner.nextInt();
        switch(huisdieren) {
            case 0:
                System.out.println("Niet echt verzot op dieren?");
                break;
            case 1:
                System.out.println("Een eenzaam beestje?");
                break;
            case 2:
                System.out.println("Twee beestjes maken ruzie.");
                break;
            case 3:
                System.out.println("Drie beestjes, leuk!");
                break;
            default:
                System.out.println("Zoveel dieren, lijkt wel klein Bokrijk!");
                break;
        }
    }
}