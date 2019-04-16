package be.vdab.tienkamper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {
        Tienkamper Jurgen = new Tienkamper("Jurgen Hingsen",8832);
        Tienkamper Roman = new Tienkamper("Roman Sebrle",8891);
        Tienkamper Daley = new Tienkamper("Daley Thompson",8847);
        Tienkamper Dan = new Tienkamper("Dan O'Brien",8891);

        List<Tienkamper> lijst = new ArrayList<>();
        lijst.add(Jurgen);
        lijst.add(Roman);
        lijst.add(Daley);
        lijst.add(Dan);

        System.out.println("Alle tienkampers uit de arraylist (=volgorde van toevoegen):");

        for (Tienkamper eenTienkamper:lijst)
            System.out.println(eenTienkamper);
        System.out.println();



        Set<Tienkamper> set = new TreeSet<>();
        set.add(Jurgen);
        set.add(Roman);
        set.add(Daley);
        set.add(Dan);

        System.out.println("Alle tienkampers uit de treeset (=gesorteerd op naam):");

        for (Tienkamper eenTienkamper:set)
            System.out.println(eenTienkamper);
        System.out.println();
    }
}
