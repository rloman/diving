package nl.capgemini.diving.tips;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

    }

    public static void demoBlocksToPreventNameHusling() {
        // Which is better?

        List<String> list = new ArrayList<>();
        {
            String name = "Ray";
            list.add(name);
        }
        {
            String name = "Ray";
            list.add(name);
        }
        {
            String name = "Ray";
            list.add(name);
        }

        // or
        String name2="Peter";
        list.add(name2);

        String name3 = "Jan";
        list.add(name2);
    }

    public static void demoEQualsTip() {
        // which is better?

        String firstName = null; // "Ray";

        if("Ray".equals(firstName)) {
            // false

        }

        //

        if(firstName.equals("Ray")) {

        }
    }
}

