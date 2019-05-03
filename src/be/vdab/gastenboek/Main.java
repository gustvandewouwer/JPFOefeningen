package be.vdab.gastenboek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GastenboekManager manager = new GastenboekManager();

        Gastenboek gastenboek = manager.lees();

        Scanner scanner = new Scanner(System.in);

        System.out.print("T=tonen, S=schrijven, E=einde:");

        for (String keuze;
             !(keuze = scanner.nextLine()).equalsIgnoreCase("E"); ) {
            switch (keuze) {
                case "T":
                case "t":
                    System.out.println(gastenboek);
                    break;
                case "S":
                case "s":
                    System.out.print("Schrijver:");
                    String schrijver = scanner.nextLine();
                    System.out.print("Boodschap:");
                    String boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.schrijf(gastenboek);
                    break;
                default:
                    System.out.println("Verkeerde keuze");
            }
            System.out.print("T=tonen,S=schrijven,E=einde:");
        }
    }

}
