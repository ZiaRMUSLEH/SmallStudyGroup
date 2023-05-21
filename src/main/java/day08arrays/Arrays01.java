package day08arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main (String[] args) {

        //Example 1: Create an integer array with 5 elements and print elements in condole.

        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 7;
        numbers[2] = 4;
        numbers[3] = 9;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        //Example 2: print elements these are less than or equal to 7 in console.
        for (int w:numbers) {
            if(w<8){
                System.out.println(w);
            }
        }



    }
}
