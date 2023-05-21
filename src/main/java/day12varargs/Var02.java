package day12varargs;

import java.util.Arrays;

public class Var02 {
    public static void main (String[] args) {


        int[]a = {4,5,6,7};
        int[]b = {2,1,3,4};



     System.out.println(Arrays.toString(mergeIntegers(a,b)));

    }

    //function to merge a variable number of arrays of integers using varargs

    public static int[] mergeIntegers (int[] ...a){
        int mergerArrLenght = 0;
        for(int[] w: a){
            mergerArrLenght=mergerArrLenght+w.length;
        }
        int[]merged = new int[mergerArrLenght];
        int index = 0;
        for (int[] w: a){
            for(int t: w){merged[index]=t;
                index++;}
        } return merged;


    }
}
