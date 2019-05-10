package nl.capgemini.diving.methodreferences.live;

import java.util.function.Predicate;

public class UsingStringStartsWith {

    public static void main(String[] args) {

        {
            // this weird code
            String str = "abc";
            Predicate<String> methodRef = str::startsWith;
            boolean strContainsSamer =  methodRef.test("Samer");
            System.out.println(strContainsSamer);
        }
        // has the same effect as ...
        {
            // this shorter code
            String str = "abc";
            boolean strContainsSamer =  str.contains("Samer");
            System.out.println(strContainsSamer);
        }
    }
}
