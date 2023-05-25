package day21maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap02 {
    public static void main (String[] args) {

        /*
        create a Map that will have the following keys and values
        Maths = 9
        English = 8
        Persian = 7
        Turkish = 6
        French = 7
        then print all courses that have scores over 7

         */

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Maths", 9);
        scores.put("English", 8);
        scores.put("Persian", 7);
        scores.put("Turkish", 6);
        scores.put("French", 7);

        for(Map.Entry<String, Integer> w: scores.entrySet()){
            if(w.getValue()>7){
                System.out.println(w.getKey());
            }
        }

    }

}
