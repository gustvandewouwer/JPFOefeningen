package be.vdab.herhaling;

import java.util.*;

public class Woorden2 {
    public static void main(String[] args) {
        Map<String, List<Integer>> mapWoorden = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef zinnen in (stop om te eindigen)");
        String zin = scanner.nextLine();
        int zinVolgnr = 0;
        while (!zin.equals("stop")) {
            zinVolgnr++;
            String[] arrWoorden = zin.split(" ");
            for (String woord : arrWoorden) {
                System.out.println(woord);
                List<Integer> aantallen = mapWoorden.get(woord);
                if (aantallen == null) {
                    aantallen = new ArrayList<>();
                    aantallen.add(zinVolgnr);
                    mapWoorden.put(woord, aantallen);
                } else {
                    aantallen.add(zinVolgnr);
                    mapWoorden.put(woord, aantallen);
                }
            }
            zin = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : mapWoorden.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

    }
}
