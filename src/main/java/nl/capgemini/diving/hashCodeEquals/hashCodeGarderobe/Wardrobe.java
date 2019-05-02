package nl.capgemini.diving.hashCodeEquals.hashCodeGarderobe;

import nl.capgemini.diving.model.Diver;
import nl.capgemini.diving.model.Suit;

import java.util.HashMap;
import java.util.Map;

public class Wardrobe {


    private static Map<Suit, Diver> content = new HashMap<>();


    public static void save(Suit suit, Diver diver) {
        content.put(suit, diver);
    }

    public static Diver get(Suit suit) {
        Diver result = content.get(suit);

        return result;
    }

}
