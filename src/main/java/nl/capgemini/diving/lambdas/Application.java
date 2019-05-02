package nl.capgemini.diving.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));


        numberList.stream().filter(n -> n % 2 == 0).forEach(n -> {
            System.out.println(n);
        });


        System.out.println(numberList);

        numberList.stream().filter(n -> n % 2 != 0).forEach(n -> {
            System.out.println(n);
        });

        System.out.println(numberList);

        numberList.stream().filter(n -> n % 2 == 0).map(a -> {
            System.out.println(a);

            return a*a;
        }).forEach(n -> {
            System.out.println(n);
        });


    }

}
