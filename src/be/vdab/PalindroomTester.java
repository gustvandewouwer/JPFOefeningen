package be.vdab;

public class PalindroomTester {
    private final StringBuilder orgTekst, revTekst;
    public PalindroomTester(String tekst) {
        orgTekst = new StringBuilder(tekst);
        revTekst = new StringBuilder(tekst);
        revTekst.reverse();
    }
    public boolean isPalindroom(boolean hoofdlettergevoelig) {
        if (!hoofdlettergevoelig) {
            return orgTekst.toString().equals(revTekst.toString() );
//toString() is nodig: orgTekst en revTekst zijn StringBuilder
        }
        else {
            String ot = orgTekst.toString().toLowerCase();
            String rt = revTekst.toString().toLowerCase();
            return ot.equals(rt);
        }
    }
    public String getOrgTekst() {
        return orgTekst.toString();
    }
    public String getRevTekst() {
        return revTekst.toString();
    }
}