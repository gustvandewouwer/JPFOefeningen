package be.vdab.herhaling;

public class Palindroom {

    public static boolean isPalindroom(String tekst) {
        StringBuffer sb = new StringBuffer(tekst);
        System.out.println(sb);
        System.out.println(sb.reverse());
//        StringBuffer sbr = new StringBuffer(sb.reverse());
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
