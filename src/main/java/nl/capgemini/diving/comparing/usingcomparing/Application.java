package nl.capgemini.diving.comparing.usingcomparing;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;
import nl.capgemini.diving.model.Suit;

import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {


        /*
        BIG ALERT:

        The TreeSet is using the COMPARING (compareTo in class) OR compare(in Comparator)
        to find if it is already in the Set ... that is a paradigm shift
        for new Java Programmers

         */
        
        {
            Set<Suit> sortedSet = new TreeSet<>();

            sortedSet.add(new Suit(Size.XLARGE, Color.RED));
            sortedSet.add(new Suit(Size.SM, Color.RED));
            sortedSet.add(new Suit(Size.SM, Color.BLACK));
            sortedSet.add(new Suit(Size.XLARGE, Color.RED));

            System.out.println(sortedSet);
        }

        {
            Set<Suit> sortedSet = new TreeSet<>((thisOne, otherOne) -> {
                return thisOne.getColor().compareTo(otherOne.getColor());
            }
            );

            sortedSet.add(new Suit(Size.XLARGE, Color.RED));
            sortedSet.add(new Suit(Size.SM, Color.RED));
            sortedSet.add(new Suit(Size.MEDIUM, Color.RED));
            sortedSet.add(new Suit(Size.SM, Color.BLACK));

            System.out.println(sortedSet);
        }
    }
}
