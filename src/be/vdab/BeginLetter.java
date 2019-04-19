package be.vdab;

import java.util.HashMap;
import java.util.Map;

public class BeginLetter {
    private static final String[] woorden = {"een", "twee", "drie",
            "vier", "vijf", "zes", "zeven", "acht", "negen", "tien"};

    public static void main(String[] args) {
        Map<Character, Integer> hashMapAantal = new HashMap<>();
//1e manier: lezen met key en begin-value putten of value verhogen
//en terug putten
        for (String woord : woorden) {
            if (hashMapAantal.get(woord.charAt(0)) == null) {
                hashMapAantal.put(woord.charAt(0), 1);
            } else {
                hashMapAantal.put(woord.charAt(0), hashMapAantal.get(woord.charAt(0)) + 1);
            }
        }
        System.out.println(
                "\nAantal woorden die beginnen met elke letter: ");
        System.out.println(hashMapAantal); //toString() HashMap wordt gebruikt
        System.out.println("size: " + hashMapAantal.size());
        System.out.println("isEmpty: " + hashMapAantal.isEmpty());
        System.out.println("------ Set van de keys ------");
        for (char c : hashMapAantal.keySet()) {
            System.out.println(c);
        }
        System.out.println("------ Set van de values ------");
        for (int i : hashMapAantal.values()) {
            System.out.println(i);
        }
        System.out.println("------ Set van de map.entries ------");
        for (Map.Entry<Character, Integer> entry : hashMapAantal.entrySet()) {
            System.out.print(entry); //toString() Map.Entry wordt gebruikt
            System.out.println(" of anders: " + entry.getKey() + " : " +
                    entry.getValue());
        }

        // 2e manier: met contains eerst nagaan of key aanwezig is
        for (String woord : woorden) {
            if (hashMapAantal.containsKey(woord.charAt(0)) == false) {
                hashMapAantal.put(woord.charAt(0) , 1);
            }
            else {
                hashMapAantal.put(woord.charAt(0) ,hashMapAantal.get(woord.charAt(0))+1);
            }
        }
    }
}
