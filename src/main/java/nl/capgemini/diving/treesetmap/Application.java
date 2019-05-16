package nl.capgemini.diving.treesetmap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {


        // we did this last Thursday
        Set<String> set = new TreeSet<>();

        set.add("Z");
        set.add("C");

        for(String element: set) {
            System.out.println(element);
        }

        // now new!!!

        Map<String, Integer> personAgeMap = new TreeMap<>();

        personAgeMap.put("Jasper", 29);
        personAgeMap.put("Alie", 60);
        personAgeMap.put("Mo", 35);

        for(String element: personAgeMap.keySet()) {
            System.out.println(element);
        }

        for(Map.Entry<String, Integer> element: personAgeMap.entrySet()){

            System.out.println("Person with name:"+element.getKey()+" has age: "+element.getValue());

        }

        for(int element: personAgeMap.values()){
            System.out.println(element);
        }

    }
}
