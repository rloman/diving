package nl.capgemini.diving.streams;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144));

        //
        numbers.stream().filter(n -> n %2 == 0)
                .filter(n -> n > 2)
                .peek(n -> System.out.println("This should not be printed!"))
                .map(n -> n *n).map(n -> n*n); // non terminals



        numbers.stream().filter(n -> n %2 == 0)
                .filter(n -> n > 2).map(n -> n *n)
                .map(n -> n*n).forEach(n -> { // terminal
            System.out.println(n);
        });

        // terminals ONLY make your stream run!


        numbers.stream()
                .filter(n -> n %2 == 0)
                .peek(n -> System.out.println("The element is: "+n))
                .filter(n -> n > 2)
                .peek(n -> System.out.println("Now the element is: "+n))
                .map(n -> n *n)
                .map(n -> n*n).forEach(n -> { // terminal
            System.out.println(n);
        });


        // count the numbers
        long count = numbers.stream()
                .filter(n -> n %2 == 0)
                .count();

        System.out.println("There are "+count+" even numbers");


        // sum the numbers
        int summed = numbers.stream().mapToInt(n -> n).sum();

        Collections.shuffle(numbers);
        System.out.println(numbers);
        System.out.println(summed);

        numbers.stream().sorted().forEach(n -> {
            System.out.println(n);
        });

        numbers.stream().distinct();

        numbers.stream().limit(5);

        Collections.sort(numbers);

        numbers = numbers.stream().skip(3).collect(Collectors.toList());

        System.out.println(numbers);


    }
}