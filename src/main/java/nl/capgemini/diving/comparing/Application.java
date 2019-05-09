package nl.capgemini.diving.comparing;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;
import nl.capgemini.diving.model.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Suit> suits = new ArrayList<>();

        suits.add(new Suit(Size.XLARGE, Color.RED));
        suits.add(new Suit(Size.SM, Color.RED));
        suits.add(new Suit(Size.SM, Color.BLACK));


        System.out.println(suits);

        Collections.sort(suits);

        System.out.println(suits);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Husam", "Hans", "B"));

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);


        List<Dummy> dummies = new ArrayList<>();

        Collections.sort(dummies);
    }
}


class Dummy implements Comparable<Dummy> {

    private double price;

    @Override
    public int compareTo(Dummy other) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(other.price));
    }
}