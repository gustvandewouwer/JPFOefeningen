package be.vdab.thread;

public class MainThread {
    public static void main(String[] args) {
        InsectenLezerThread thread1 = new InsectenLezerThread("/data/insecten1.csv", System.out);
        InsectenLezerThread thread2 = new InsectenLezerThread("/data/insecten2.csv", System.err);
        thread1.start();
        thread2.start();
    }
}
