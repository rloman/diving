package nl.capgemini.diving.hashCodeGarderobe;

import nl.capgemini.diving.model.Diver;
import nl.capgemini.diving.model.Suit;

public class Application {

    public static void main(String[] args) {


        // save the stuff
        Diver moataz = new Diver("Moataz");

        Suit suit1 = new Suit();
        suit1.setColor("Black");
        suit1.setSize("XL");

        Wardrobe.save(suit1, moataz);


        //print the Person of The Suit with properties XL and Black

        getIt();
    }

    public static void getIt() {

        Suit suit2 = new Suit();
        suit2.setSize("XL");
        suit2.setColor("Black");


        Diver moatazDiver = Wardrobe.get(suit2);

        System.out.println(moatazDiver);


    }
}
