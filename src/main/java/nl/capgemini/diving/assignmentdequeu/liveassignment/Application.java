package nl.capgemini.diving.assignmentdequeu.liveassignment;

import java.util.ArrayDeque;

public class Application {

    public static void main(String[] args) {

        ArrayDeque<String> persons = new ArrayDeque<>();

        // Add some names to the queue but ...
        // if the name is "Willem-Alexander" it should be addFirst,

        // then loop over the persons and print the content

        String name = "Willem-Alexander";

        if ("Willem-Alexander".equals(name)) {
            persons.addFirst(name);
        }
        else {
            persons.addLast(name);
        }


    }
}
