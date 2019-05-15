package nl.capgemini.diving.concurrency.bakery;

public class Consumer extends Thread {


    @Override
    public void run() {
        for(int i = 0;i<5;i++) {
            Supply.getInstance().decrement();
            System.out.println(Supply.getInstance());
        }
    }
}
