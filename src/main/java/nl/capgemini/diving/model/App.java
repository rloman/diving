package nl.capgemini.diving.model;

public class App {

    public static void main(String[] args) {
        Drinker d = new Drinker.DrinkerBuilder().name("Ray").age(33).build();

        System.out.println(d);
    }
}
