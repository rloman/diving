package nl.capgemini.diving.concurrency;

public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world, I am a thread printing this ... ");
    }


}
