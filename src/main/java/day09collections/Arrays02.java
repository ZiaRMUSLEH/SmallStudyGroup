package day09collections;

import java.util.*;

public class Arrays02 {
    public static void main (String[] args) {

        /*
        given a number N. your task is to check whether it is fascinating or not.
        Fascinating Number: when a number (should contain 3 digits or more ) is multiplied by 2 and 3,
        and when both these products are concatenated
        with the original number, then it results in all digits from 1 to 9 present exactly once.
         */

        System.out.println(fascinatingNUm(193));

    }

    public static boolean fascinatingNUm (int n) {
            int a = n * 2;
            int b = n * 3;
            String c = ""+n + a + b;
          //  System.out.println(c);
            char[] d = c.toCharArray();
            Arrays.sort(d);
           // System.out.println(Arrays.toString(d));

        c = new String(d);
        //System.out.println(c);
            return c.equals("123456789");








    }

}

