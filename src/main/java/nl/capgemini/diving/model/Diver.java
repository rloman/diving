package nl.capgemini.diving.model;

public class Diver {

    private String name;

    public Diver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Diver{" +
                "name='" + name + '\'' +
                '}';
    }
}
