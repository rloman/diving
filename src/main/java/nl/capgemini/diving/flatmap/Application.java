package nl.capgemini.diving.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    // credits: https://www.geeksforgeeks.org/stream-flatmap-java-examples/

    public static void main(String[] args) {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Creating a list of a list of integers (adding the three lists above to the list)
        // in fact we have a 2-dimensional list here!
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);

        // output
        /*
        The Structure before flattening is : [[5, 7, 11, 13], [1, 3, 5], [2, 4, 6, 8]]
The Structure after flattening is : [5, 7, 11, 13, 1, 3, 5, 2, 4, 6, 8]
         */
    }
}
