package nl.capgemini.diving.enums;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;
import nl.capgemini.diving.model.Suit;

public class Application {

    public static void main(String[] args) {
        Suit suit1 = new Suit(Size.XLARGE, Color.BLACK); // some like this!

        System.out.println(suit1.getSize());

        switch(suit1.getSize()) {
            case XLARGE:

                System.out.println();
            case LARGE:
            case MEDIUM:
        }

        switch (suit1.getColor()){
            case RED:
            case BLACK:
        }

        System.out.println("The price of the suit is: "+suit1.getSize().getPrice());

        suit1.getSize().setPrice(13.00);

        System.out.println("The price of the suit is: "+suit1.getSize().getPrice());

        Suit suit2 = new Suit(Size.XLARGE, Color.RED);

        System.out.println(suit2.getSize().getPrice());


    }
}
