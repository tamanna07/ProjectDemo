package Map;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();

        people.put("Tamanna", 23);
        people.put("Rifath", 24);
        people.put("Taa", 21);
        people.put("Tanna", 22);
        people.put("Tamana", 20);


//        for ( String i : people.keySet()) {
//            System.out.println(i);
//        }


        for (Map.Entry< String , Integer>  entry: people.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }





}
