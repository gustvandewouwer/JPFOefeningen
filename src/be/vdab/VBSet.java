package be.vdab;

import java.util.HashSet;
import java.util.Set;

public class VBSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("fiets");
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
        hs.add("aap");
        System.out.println("Voorbeeld van een HashSet:");
        for (String woord : hs) {
            System.out.println(woord + "\t" + woord.hashCode());
        }
    }
}
