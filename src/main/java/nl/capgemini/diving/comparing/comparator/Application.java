package nl.capgemini.diving.comparing.comparator;

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

        Suit s1 = new Suit(Size.XLARGE, Color.RED);
        Suit s2 = new Suit(Size.SM, Color.BLACK);

        suits.addAll(Arrays.asList(s1, s2));

        System.out.println(suits);

        // first way (old school)
        Collections.sort(suits, new SuitSizeComparator());

        System.out.println(suits);

        // what do you think of this one :-)

        // lambda expression

        // second way (sexier way)
        Collections.sort(suits, (me, other) -> me.getColor().compareTo(other.getColor()));

        suits.forEach( suit -> {
            System.out.println(suit);
        });

        Collections.sort(suits, (Suit thisOne, Suit otherOne) -> {
            return thisOne.getColor().compareTo(otherOne.getColor());
        });

    }
}
