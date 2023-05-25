package day21maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap01 {
    // create a hashmap to store countries : capitals in key:value structure

    public static void main (String[] args) {

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Turkey","Istanbul");
        capitals.put("USA","Washington DC");
        capitals.put("United Kingdom","London");
        capitals.put("Germany","Berlin");

        System.out.println(capitals);

        System.out.println("Keys: "+capitals.keySet());
        System.out.println("Values: "+capitals.values());

        for(Map.Entry<String, String> w: capitals.entrySet()){
            System.out.println("Keys: "+ w.getKey()+", Values: "+w.getValue());

        }



    }
}
