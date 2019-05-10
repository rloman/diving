package nl.capgemini.diving.arraydequeue;

import java.util.ArrayDeque;

public class AppArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for(int i = 0 ;i<100;i++) {
            int random = (int)(Math.random()* 1000);
            if(random % 2 != 0) { //odd number
                numbers.addFirst(random);
            }
            else {
                numbers.addLast(random);
            }
        }

        for(int element: numbers) {
            System.out.println(element);
        }
    }
}
