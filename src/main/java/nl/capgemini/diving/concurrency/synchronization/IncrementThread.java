package nl.capgemini.diving.concurrency.synchronization;

public class IncrementThread extends Thread {

    @Override
    public void run() {
        for(int i = 0;i<5;i++) {
            Counter.increment();
        }
    }


}
