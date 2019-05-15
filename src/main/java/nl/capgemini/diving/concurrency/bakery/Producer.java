package nl.capgemini.diving.concurrency.bakery;

public class Producer extends Thread {

    @Override
    public void run() {
        for(int i = 0;i<100;i++) {
            Supply.getInstance().increment();
            Thread.yield();
        }
    }
}
