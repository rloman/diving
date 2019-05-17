package nl.capgemini.diving.recursion;

import nl.capgemini.diving.assertions.Assertion;

public class Application {

    public static void main(String[] args) {
        RecList list = new RecList();

        list.add("Moataz");
        list.add("Malek");
        list.add("Saleh");
        list.add("Mohamad");
        list.add("Husam");
        list.add("Samer");

        list.printMe();

        System.out.println(list.size());

        Assertion.ensure(list.size() == 6);
    }
}