package nl.capgemini.diving.concurrency.bakery;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        Supply supply = Supply.getInstance();

        // create one producer

        // create 20 times a consumer which buys per consumer 5 breads

        // print the final result

        // then ...

        // add print statement while the consumer is decrementing the supply (int)
        // watch that there might be (and should be) negative values of the supply
        // which in the real world is not possible

        for(int i = 0;i<20;i++) {
            // create 20 consumers
            new Consumer().start();
        }
        new Producer().start();


        Thread.sleep(5000);

        System.out.println(supply);

    }
}
