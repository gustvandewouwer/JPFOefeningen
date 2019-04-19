package be.vdab.thread;

public class GemiddeldeRekenaarMain {
    public static void main(String[] args) {
        double[] getallen = new double[1000000];

        for (int i = 0; i != getallen.length; i++) {
            getallen[i] = Math.random();
        }

        GemiddeldeRekenaar gemiddeldeRekenaar1 =
                new GemiddeldeRekenaar(getallen, 0, getallen.length / 2);

        GemiddeldeRekenaar gemiddeldeRekenaar2 =
                new GemiddeldeRekenaar(getallen, getallen.length / 2, getallen.length);

        Thread thread1 = new Thread(gemiddeldeRekenaar1);
        Thread thread2 = new Thread(gemiddeldeRekenaar2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println((gemiddeldeRekenaar1.getGemiddelde() + gemiddeldeRekenaar2.getGemiddelde()) / 2);
    }
}

