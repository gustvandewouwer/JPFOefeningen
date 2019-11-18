package be.vdab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VBArrayList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("fiets");
        al.add(null); //null-element toegestaan
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen"); //dubbels toegestaan
        al.add("boom");
        al.add("aap");
        System.out.println("4e element is: " + al.get(3));
        System.out.println("Voorbeeld van een ArrayList:");
        for (String woord : al) {
            System.out.println(woord);
        }

        al.add(3, "drie");
        showList(al);
        al.remove(3);
        showList(al);
    }

    private static void showList(List<String> al) {
        System.out.println("INHOUD LIST");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
