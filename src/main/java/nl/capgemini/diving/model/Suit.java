package nl.capgemini.diving.model;

public class Suit {

    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Suit suit = (Suit) o;

        if (size != null ? !size.equals(suit.size) : suit.size != null) return false;
        return color != null ? color.equals(suit.color) : suit.color == null;
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
