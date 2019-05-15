package nl.capgemini.diving.concurrency.synchronization;

public class Counter {

    private static int number;


    public static  void increment() {
        // take te lock of the toilet
        int local = number;
        local = local + 1;
        number = local;
        // unlock it
    }

    public static int getNumber() {
        return number;
    }
}
