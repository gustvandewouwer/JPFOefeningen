package be.vdab.thread;

public class StapelMain {
    public static void main(String[] args) {
        Stapel stapel = new Stapel();
        Thread thread1 = new Thread(new Kok(stapel));
        Thread thread2 = new Thread(new Kok(stapel));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stapel.getAantalPannenkoeken());
    }
}
