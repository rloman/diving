package nl.capgemini.diving.arraydequeue;

import java.util.ArrayDeque;

public class Application {

    public static void main(String[] args) {

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for(int i = 0;i<100;i++) {
            int random = (int) (Math.random()* 100);
            if(random % 2 ==0) {
                numbers.addLast(random);
            }
            else {
                numbers.addFirst(random);
            }
        }

        numbers.forEach(System.out::println);
    }
}
