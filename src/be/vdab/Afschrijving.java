package be.vdab;

public interface Afschrijving {
    int termijn();

    double jaarlijksBedrag();

    default int tienjaarstermijn() {
        return 10;
    }

    static void beschrijving() {
        System.out.println("Een investering of aankoop verdelen over een " + "bepaalde termijn.");
    }
}