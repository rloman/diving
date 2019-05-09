package nl.capgemini.diving.hashCodeEquals.equalstrainer;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;
import nl.capgemini.diving.model.Suit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Set<Suit> suits = new HashSet<>();


        Suit first = new Suit();
        first.setColor(Color.BLACK);
        first.setSize(Size.XLARGE);

        suits.add(first);

        System.out.println(suits);

        if (suits.size() != 1) {
            throw new AssertionError();
        }

        Suit second = new Suit();
        second.setSize(Size.XLARGE);
        second.setColor(Color.BLACK);


        if(!suits.contains(second)) {
            suits.add(second); // should NOT be inserted
        }


        System.out.println(suits);


        List<Suit> suitList = new ArrayList<>();
        suitList.add(first);
        suitList.add(second);
        suitList.add(first);
        suitList.add(second);
//        suitList.addAll(Arrays.asList(first, second, first, second));

        System.out.println(suitList);


        if (suits.size() != 1) {
            throw new AssertionError();
        }
    }
}
