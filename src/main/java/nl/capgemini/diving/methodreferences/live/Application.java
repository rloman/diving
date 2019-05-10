package nl.capgemini.diving.methodreferences.live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89));

        // static method reference
        numbers.forEach(System.out::println);

        // has the same effect as ...
        numbers.forEach(n -> {
            System.out.println(n);
        });
    }
}
