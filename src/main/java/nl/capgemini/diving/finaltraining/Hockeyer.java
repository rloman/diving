package nl.capgemini.diving.finaltraining;

public class Hockeyer {

    private final String name; // error if NOT FILLED with ALL constructors


    public Hockeyer() {
        super();
        this.name = "John Doe";
    }

    public Hockeyer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void play() {

    }

}