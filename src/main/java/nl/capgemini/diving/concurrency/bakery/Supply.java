package nl.capgemini.diving.concurrency.bakery;

public final class Supply {

    private int supply;


    private static Supply instance = null;


    public static synchronized Supply getInstance() {

        if (instance == null) {
            instance = new Supply();
        }
        return instance;
    }

    private Supply() {

    }

    public synchronized void increment() {
        this.supply++;
        notify();
    }

    public synchronized void decrement() {
        while (this.supply == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.supply--;
    }

    public int getSupply() {
        return this.supply;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "supply=" + this.getSupply() +
                '}';
    }
}