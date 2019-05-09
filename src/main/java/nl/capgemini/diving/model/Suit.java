package nl.capgemini.diving.model;

public class Suit implements Comparable <Suit>  {

    private Size size;
    private Color color;

    public Size getSize() {
        return size;
    }

    public Suit(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    public Suit() {

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

    @Override
    public int compareTo(Suit other) {

        // first compare them on the size
        int compareOnSize = this.size.compareTo(other.size);

        // if they are not the same, I am done ...
        if(compareOnSize != 0) {
            return compareOnSize;
        }
        else {
            // if they are the same, compare them on color
            return this.color.compareTo(other.color);
        }
    }
}
