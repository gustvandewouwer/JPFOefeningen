package be.vdab.thread;

public class MainRunnable {
    public static void main(String[] args) {
        InsectenLezerRunnable lezer1 = new InsectenLezerRunnable("/data/insecten1.csv", System.out);
        Thread thread1 = new Thread(lezer1);
        InsectenLezerRunnable lezer2 = new InsectenLezerRunnable("/data/insecten2.csv", System.err);
        Thread thread2 = new Thread(lezer2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            // Het uitvoeren van de join method kan een InterruptedException werpen // Je ziet hierover meer later in de cursus
            System.err.println(ex);
        }

        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");

    }
}
