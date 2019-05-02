package nl.capgemini.diving.enums;

import nl.capgemini.diving.model.Color;
import nl.capgemini.diving.model.Size;

public class Suit {

    private Size size;
    private Color color;


    public Suit(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
