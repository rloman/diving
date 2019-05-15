package nl.capgemini.diving.concurrency.synchronization;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread incThread = new IncrementThread();
            incThread.start();
        }

        Thread.sleep(15000);
        System.out.println(Counter.getNumber());
    }
}
