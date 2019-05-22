package lesson17;

public class Singer2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.microphone) {
                try {
                    Monitors.microphone.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 4; i++) {
                    System.out.println("FA-----LA");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (Monitors.microphone) {
                    Monitors.microphone.notify();
                }
            }
        }
    }
}
