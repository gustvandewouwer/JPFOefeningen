package be.vdab;

public class Studentscores {
    public static void main(String[] args) {
        int score1 = 8;
        int score2 = 6;
        int score3 = 9;
        int score4 = 4;
        int totaalScore = score1 + score2 + score3 + score4;
        float gemiddelde = totaalScore / 4F;
        float percentage = totaalScore / 40F * 100;
        System.out.println("Het gemiddelde is " + gemiddelde + " op 10");
        System.out.println("Het behaalde percentage is " + percentage + " %");
    }
}