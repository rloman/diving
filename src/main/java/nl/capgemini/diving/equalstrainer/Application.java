package nl.capgemini.diving.equalstrainer;

import nl.capgemini.diving.model.Suit;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Set<Suit> suits = new HashSet<>();


        Suit first = new Suit();
        first.setColor("Black");
        first.setSize("XL");

        suits.add(first);

        System.out.println(suits);

        if (suits.size() != 1) {
            throw new AssertionError();
        }

        Suit second = new Suit();
        second.setSize("XL");
        second.setColor("Black");


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
