package nl.capgemini.diving.instanceofassignment;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        foo(animals);

    }

    public static void foo(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.bark();
            }
        }
    }
}
