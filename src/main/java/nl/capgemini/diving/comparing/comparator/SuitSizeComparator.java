package nl.capgemini.diving.comparing.comparator;

import nl.capgemini.diving.model.Suit;

import java.util.Comparator;

public class SuitSizeComparator implements Comparator<Suit> {

    @Override
    public int compare(Suit thisOne, Suit otherOne) {

        return thisOne.getColor().compareTo(otherOne.getColor());
    }
}
