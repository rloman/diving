package nl.capgemini.diving.tips;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // which is better?

        String firstName = null; // "Ray";

        if("Ray".equals(firstName)) {
            // false

        }

        //

        if(firstName.equals("Ray")) {

        }



        // Which is better?

        List<String> list = new ArrayList<>();
        {
            String name = "Ray";
            list.add(firstName);
        }
        {
            String name = "Ray";
            list.add(firstName);
        }
        {
            String name = "Ray";
            list.add(firstName);
        }

        // or
        String name2="Peter";
        list.add(name2);

        String name3 = "Jan";
        list.add(name2);



    }
}

