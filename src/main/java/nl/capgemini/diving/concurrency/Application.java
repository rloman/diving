package nl.capgemini.diving.concurrency;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        assignment();
    }

    public static void demo() {
        System.out.println("This is a thread");

        for (int i = 0; i < 10; i++) {
            Thread thread = new HelloWorldThread();
            thread.start();
        }

        System.out.println("Done main");

    }

    public static void assignment() throws InterruptedException {

        Thread[] threads = new Thread[21];

        for (int i = 0; i <= 20; i++) {
            Thread counterThread = new CounterThread(i);
            if (i % 5 == 0) {
                counterThread.setPriority(Thread.MAX_PRIORITY);
            } else {
                counterThread.setPriority(Thread.MIN_PRIORITY);
            }

            threads[i] = counterThread;

            counterThread.join();
        }

        for (int i = 0; i <= 20; i++) {
            threads[i].start();


        }


    }
}


