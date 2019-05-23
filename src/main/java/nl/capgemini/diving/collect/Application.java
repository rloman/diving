package nl.capgemini.diving.collect;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");

        String result = list.parallelStream().collect(
                StringBuilder::new, // Supplier
                (response, element) -> response.append(" ").append(element), // accumulator
                (response1, response2) -> response1.append(",").append(response2.toString())) // combiner
                .toString();
        System.out.println("Result: " + result);
    }

    // show the stream::collect(Collectors.toList())
}
