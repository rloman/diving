package nl.capgemini.diving.hashCodeEquals.hashCodeGarderobe;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Diver;
import nl.capgemini.diving.model.Size;
import nl.capgemini.diving.model.Suit;

public class Application {

    public static void main(String[] args) {


        // save the stuff
        Diver moataz = new Diver("Moataz");

        Suit suit1 = new Suit();
        suit1.setColor(Color.RED);
        suit1.setSize(Size.XLARGE);

        Wardrobe.save(suit1, moataz);


        //print the Person of The Suit with properties XL and Black

        getIt();
    }

    public static void getIt() {

        Suit suit2 = new Suit();
        suit2.setSize(Size.SM);
        suit2.setColor(Color.BLACK);


        Diver moatazDiver = Wardrobe.get(suit2);

        System.out.println(moatazDiver);


    }
}
