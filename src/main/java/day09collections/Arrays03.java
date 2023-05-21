package day09collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays03 {
    /*
    given a number N. yur task is to check whether it is fascinating or not.
    fascinating number: when a number (should contain 3 digits or more) is multiplied by 2 and 3, and
    when both these products are concatenated with the original number, then it results in all digits from 1 to 9
    present exactly once.
     */

    public static void main (String[] args) {
        System.out.println(isFascinatingNumber(192));
    }

   public static boolean isFascinatingNumber (int number){
       char[] allNumberConcatArr = (("" + number + (number * 2) + (number * 3)).toCharArray());
       Arrays.sort(allNumberConcatArr);
       String allNumberConcatStr = new String(allNumberConcatArr);
       return allNumberConcatStr.equals("123456789");
    }
}
