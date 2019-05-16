package nl.capgemini.diving.unaryoperator;

import nl.capgemini.diving.assertions.Assertion;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Application {
    public static void main(String[] args) {
        biFunction();

    }

    // like a++, b++, hence a thing in, an operator and the same thing out (one parameter)
    public static void demoUnaryOperator() {

        UnaryOperator<Integer> a = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer++;
            }
        };

        UnaryOperator<Integer> faster = (n) -> ++n;

        System.out.println(faster.apply(3));

        Assertion.require(faster.apply(3) == 4);


    }

    // like a+1, b++\2, hence a thing in and the same thing again in, an operator and the same thing out (one parameter) like a+b=c
    public static void demoBinaryOperator() {
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        // or

        BinaryOperator<Integer> add = (n, m) -> {
            return n+m;
        };
    }

    public static void demoFunction() {
        Function<Integer, String> stringFunction = (number) -> {
            return ""+number;
        };
    }

    public static void biFunction() {
        BiFunction<Integer, Integer, String> stringIt = (n,m) -> {
            String s = ""+n+m;
            String result = "";
            for(char c: s.toCharArray()) {
                result+= c;
            }

            return result;
        };

        Assertion.ensure("34".equals(stringIt.apply(3,4)));
    }
}
