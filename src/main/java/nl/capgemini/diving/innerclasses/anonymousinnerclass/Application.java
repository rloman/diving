package nl.capgemini.diving.innerclasses.anonymousinnerclass;

public class Application {

    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {

                System.out.println("I am running ... ");

            }
        };

        Thread t1 = new Thread(r);

        t1.start();

        System.out.println("This is the main calling ... ");

        Thread t2 = new Thread(r);
        t2.start();

        // example
        /*

        mouse.addMouseListener(new MouseListener() {
            @Override
            public void onClick() {
                System.out.println("You clicked me ... ");
            }

        });
*/
    }
}

