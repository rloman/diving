package nl.capgemini.diving.concurrency.runnable;

public class Diver extends Person implements Runnable {

    @Override
    public void run() {

        System.out.println("Diver is now happily running ... and diving ... ");

    }
}
