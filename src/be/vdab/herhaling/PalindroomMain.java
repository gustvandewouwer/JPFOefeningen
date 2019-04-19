package be.vdab.herhaling;

public class PalindroomMain {
    public static void main(String[] args) {
        String tekst = "lepel";
        System.out.println(tekst + " is palindroom: " + Palindroom.isPalindroom(tekst));

        System.out.println(
                new StringBuilder("lepel").reverse().toString().equals("lepel") ?
                        "palindroom" : "geen palindroom");

        StringBuilder sb = new StringBuilder("lepel");
        String sbs = sb.toString();
        System.out.println(sbs.equals(sb.reverse().toString()));

        System.out.println(sb);
        String sb2 = sb.reverse().toString();
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println();
    }
}
