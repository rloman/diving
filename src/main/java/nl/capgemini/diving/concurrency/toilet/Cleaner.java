package nl.capgemini.diving.concurrency.toilet;

public class Cleaner implements Runnable {


    @Override
    public void run() {

        for (; ; ) {
            try {
                Toilet.getInstance().clean();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
