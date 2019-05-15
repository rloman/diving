package nl.capgemini.diving.concurrency.runnable;

public class Application {

    public static void main(String[] args) {

        Thread diverRunner = new Thread(new Diver());

        diverRunner.start();

        Thread threadWithLambda = new Thread(() -> {
            System.out.println("I am really a Runnable implementor using a lambda expression ... ");
        });

        Thread threadWithRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am really a Runnable implementor using an anonymous method local inner class ... ");
            }
        });

    }
}
