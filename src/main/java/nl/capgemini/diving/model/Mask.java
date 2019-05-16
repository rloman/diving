package nl.capgemini.diving.model;

import nl.capgemini.diving.model.Color;

public class Mask {

    private double price;

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
