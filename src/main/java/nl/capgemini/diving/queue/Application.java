package nl.capgemini.diving.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {
        Queue<String> persons = new LinkedList<>();

        persons.add("charly");
        persons.add("papa");

        System.out.println(persons.poll()); // no exception when null
        System.out.println(persons.peek());
        System.out.println(persons.peek());
        System.out.println(persons.peek()); // just look

        System.out.println(persons.poll());

        System.out.println(persons.poll());

        System.out.println(persons.remove()); //exception when null
        System.out.println(persons.element()); // like peek but exception when null

    }
}
