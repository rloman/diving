package nl.capgemini.diving.finaltraining;

public class Application {

    public static void main(String[] args) {

        // context: final variable


        int age = 45;
        age++;

        final int myAge = 50;
//        myAge++; // compile error

    }
}
