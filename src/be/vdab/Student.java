package be.vdab;

public class Student {
    private String naam;
    private int score;

    public Student(String naam) {
        this.naam = naam;
    }
    public Student(String naam, int score) {
        this(naam); //oproep vorige constructor ipv this.naam = naam;
        this.score = score;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getNaam() {
        return naam;
    }
    public int getScore() {
        return score;
    }
}