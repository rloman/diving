package nl.capgemini.diving.concurrency.synchronization;

public class Counter {

    private static int number;


    public static void increment() {
        int local = number;
        local = local + 1;
        number = local;
    }

    public static int getNumber() {
        return number;
    }
}
