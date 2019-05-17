package nl.capgemini.diving.recursion;

import nl.capgemini.diving.assertions.Assertion;

public class TreeApp {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(8);
        tree.add(9);
        tree.add(7);

        tree.print();

        Assertion.ensure(tree.size() == 6);
        System.out.println(tree.size());
    }
}
