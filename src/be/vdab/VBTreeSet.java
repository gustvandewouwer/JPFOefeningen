package be.vdab;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class VBTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("fiets");
        ts.add("even");
        ts.add("dak");
        ts.add("citroen");
        ts.add("boom");
        ts.add("aap");
//        hs.add(null);
        ts.add("dak");

        System.out.println("Voorbeeld van een TreeSet:");
        for (String h : ts) {
            System.out.println(h);
        }

        //Extra methods
        SortedSet<String> ss = (SortedSet) ts;
        System.out.println("\nExtra methods:");
        System.out.println("Eerste element: " + ss.first());
        System.out.println("Laatste element: " + ss.last());
        ss.remove("dak");

        System.out.println("SORTEDSET ZONDER DAK");
        for (String s : ss) {
            System.out.println(s);
        }

        System.out.println("TREESET");
        for (String t : ts) {
            System.out.println(t);
        }
        SortedSet<String> ssSubSet = ss.subSet("boom", "even");
        System.out.println("\nSubSet van de TreeSet vanaf 'boom' tot 'even':");
        for (String woord : ssSubSet) {
            System.out.println(woord);
        }
    }
}
