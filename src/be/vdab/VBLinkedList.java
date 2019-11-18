package be.vdab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VBLinkedList {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("fiets");
        ll.add(null);
        ll.add("even");
        ll.add("dak");
        ll.add("citroen");
        ll.add("citroen");
        ll.add("boom");
        ll.add("aap");

        System.out.println("4e element is: " + ll.get(3));
        ll.add(3, "test");
        System.out.println("Voorbeeld van een LinkedList:");
        for (String woord : ll) {
            System.out.println(woord);
        }
        System.out.println("\nWeergave m.b.v. iterator");
        for (Iterator<String> i = ll.iterator(); i.hasNext(); ) {
            String woord = i.next();
            System.out.println(woord);
        }

        for (String s : ll) {
            System.out.println(s);
        }

        System.out.println("\nExtra methods");
        LinkedList<String> llijst = (LinkedList) ll;
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
        llijst.addFirst("eerste");
        llijst.addLast("laatste");
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
        System.out.println(llijst.removeFirst());
        System.out.println(llijst.removeLast());
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
    }
}
