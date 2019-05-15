package nl.capgemini.diving.concurrency;

public class CounterThread extends Thread {

    private long id;

    public CounterThread(long id) {
        this.id = id;
    }

    @Override
    public void run()  {
        for(int i = 0;i<10;i++) {
            System.out.println("This is thread: "+id+" print number: "+i);
//            Thread.yield(); // I stop my work for an other thread and than ... please kernel / linux / windows restart me ...
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
