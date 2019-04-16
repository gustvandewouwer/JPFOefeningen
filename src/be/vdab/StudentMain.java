package be.vdab;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Piet");
        Student student2 = new Student("Jef",14);

        String naam = student1.getNaam();
        int score = student1.getScore();
        System.out.println("Student " + naam + " met score: " + score);

        naam = student2.getNaam();
        score = student2.getScore();
        System.out.println("Student " + naam + " met score: " + score);

//Piet een score geven en terug geg tonen
        student1.setScore(9);
        naam = student1.getNaam();
        score = student1.getScore();
        System.out.println("Student " + naam + " met score: " + score);

//Jef zijn naam wijzigen naar Jeff en score wijzigen van 14 naar 16
        student2.setNaam("Jeff");
        student2.setScore(16);
        naam = student2.getNaam();
        score = student2.getScore();
        System.out.println("Student " + naam + " met score: " + score);
    }
}