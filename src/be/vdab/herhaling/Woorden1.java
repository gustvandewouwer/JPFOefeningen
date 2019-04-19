package be.vdab.herhaling;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Woorden1 {
    public static void main(String[] args) {
        Map<String, Integer> mapWoorden = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef zinnen in (stop om te eindigen)");
        String zin = scanner.nextLine();
        while (!zin.equals("stop")) {
            String[] arrWoorden = zin.split(" ");
            for (String woord :
                    arrWoorden) {
                System.out.println(woord);
                Integer aantal = mapWoorden.get(woord);
                if (aantal == null) {
                    mapWoorden.put(woord, 1);
                } else {
                    mapWoorden.put(woord, aantal + 1);
                }
//                if (mapWoorden.containsKey(woord)) {
//                    Integer aantal = mapWoorden.get(woord);
//                    aantal++;
//                    mapWoorden.put(woord, aantal);
//                } else {
//                    mapWoorden.put(woord, 1);
//                }
            }
            zin = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mapWoorden.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

    }
}
