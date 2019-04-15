package be.vdab;

public class OmrekeningSeconden {
    public static void main(String[] args) {
        int totSec = 5924;
        int uren = totSec / 3600; //3600 sec in een uur
        int rest = totSec % 3600; //rest bevat resterende sec
        int minuten = rest / 60;
        int seconden = rest % 60;
        System.out.println("U:" + uren + " M:" + minuten + " S:" + seconden);
    }
}