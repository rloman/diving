package nl.capgemini.diving.methodreferences;

import nl.capgemini.diving.model.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;


// first to mention ... I am still not convinced that this helps
// us to create better software but I like it ... :-)
public class Application {

    public static void main(String[] args) {

        List<Integer> names = new ArrayList<>();

        names.addAll(Arrays.asList(0, 1, 1, 2, 3, 5, 8));

        names.forEach(System.out::println);

        Mask m = maskProducer(Mask::new);
        m.setColor(Color.RED);

        print(m::getColor);

        m.setColor(null);

        fill(m::setColor);
    }


    public static Mask maskProducer(Supplier<Mask> maskSupplier) {

        return maskSupplier.get();

    }

    public static void fill(Consumer<Color> colorConsumer) {

        colorConsumer.accept(Color.BLUE);

    }


    public static void print(Supplier<Color> getter) {

        System.out.println(getter.get());

    }
}
