package nl.capgemini.diving.model.lombok;

public class Application {

    public static void main(String[] args) {
        Drinker d = new Drinker.DrinkerBuilder().name("Ray").age(33).build();

        System.out.println(d.getName());

        System.out.println(d);
    }
}
