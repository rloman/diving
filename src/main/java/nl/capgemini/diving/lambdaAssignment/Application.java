package nl.capgemini.diving.lambdaAssignment;

import nl.capgemini.diving.enums.Suit;
import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        List<Suit> suits = new ArrayList<>();

        Suit suit = new Suit(Size.XLARGE, Color.BLACK);
        Suit suit2 = new Suit(Size.SM, Color.RED);
        Suit suit3 = new Suit(Size.SM, Color.RED);


        suits.addAll(Arrays.asList(suit, suit2, suit3));


        suits.stream().map(n -> n.getSize()).distinct().forEach(n -> {
            System.out.println(n);
        });

    }
}
