package be.vdab.thread;

import java.time.LocalTime;

public class Klok implements Runnable {
    @Override
    public void run() {
        boolean verderDoen = true;
        while (verderDoen) {
            System.out.println(LocalTime.now());
            if (Thread.interrupted()) {
                verderDoen = false; // klok stopzetten
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                verderDoen = false; // klok stopzetten } }
            }
        }
    }
}
