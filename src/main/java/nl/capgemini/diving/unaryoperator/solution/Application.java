package nl.capgemini.diving.unaryoperator.solution;


import nl.capgemini.diving.assertions.Assertion;
import nl.capgemini.diving.model.Mask;

import java.util.function.BinaryOperator;

public class Application {

    public static void main(String[] args) {

        Mask m1 = new Mask();
        m1.setPrice(3.5);

        Mask m2 = new Mask();
        m2.setPrice(3.5);

        BinaryOperator<Mask> maskAdder = (n, m) -> {
            Mask result = new Mask();
            result.setPrice(n.getPrice()+m.getPrice());

            return result;
        };


        Assertion.ensure(maskAdder.apply(m1,m2).getPrice() == 7);


    }
}
