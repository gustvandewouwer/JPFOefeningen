package be.vdab.herhaling;

import java.util.Set;
import java.util.TreeSet;

public class PersoonMain {
    public static void main(String[] args) {
//        Persoon pers1 = new Persoon("Gust", "VDW");
//        System.out.println(pers1.getNaam());

        Personen personen = new Personen();
        personen.add(new Persoon("Joe", "Dalton"));
        personen.add(new Persoon("Sarah", "Bernhardt"));
        PersoonManager manager = new PersoonManager();
        manager.save(personen); // slaat op in een bestand op de harde schijf
        Personen personen2 = manager.load(); // leest de data van het bestand terug
        System.out.println(personen2);

        Set<Persoon> setPersonen = new TreeSet<>();
        setPersonen.add(new Persoon("Jan", "Janssen"));
        setPersonen.add(new Persoon("Jan", "Merckx"));
        setPersonen.add(new Persoon("Jan", "Hovens"));
        setPersonen.add(new Persoon("Jan", "VDW"));
        setPersonen.add(new Persoon("Jan", "GWO"));
        setPersonen.add(new Persoon("Fred", "Janssen"));
        setPersonen.add(new Persoon("Xavier", "Janssen"));
        setPersonen.add(new Persoon("Stan", "Janssen"));

        for (Persoon persoon :
                setPersonen) {
            System.out.println(persoon.toString());
        }


    }
}
