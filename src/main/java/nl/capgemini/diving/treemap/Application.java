package nl.capgemini.diving.treemap;

import java.util.TreeMap;

public class Application {


    public static void main(String[] args) {

        // A treemap is a Map which keys are sorted and which you can ask for keys in a range
        // so you don't need the key value exactly ...

        TreeMap<String, Integer> ageMap = new TreeMap<>();

        ageMap.put("Raymond", 50);
        ageMap.put("Jane", 48);
        ageMap.put("Lieke", 16);
        ageMap.put("Wout", 13);

        System.out.println(ageMap.get("Raymond"));

        System.out.println(ageMap.get("R"));
        System.out.println(ageMap.ceilingEntry("R"));

        System.out.println(ageMap.ceilingEntry("R").getValue());

    }
}
