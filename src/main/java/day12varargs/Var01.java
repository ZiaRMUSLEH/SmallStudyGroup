package day12varargs;

import java.util.Arrays;

public class Var01 {
    public static void main (String[] args) {
        func(6);
        func(6, 4);
        func(4,5,5,5,4,7,8,9,3,1,5);
        func();
        sumVarargs(4,1,1,1,1);
        concatenateStrings("zia","rahman"," musleh");
        maximumVarargs(4,8,6,9,7,3,5,2,4,14,25,1,4,5,9);
    }
    public static void func(int a){
        System.out.println(a);
    }
    public static void func(int a, int b){
        System.out.println(a+","+b);
    }
    public static void func(int ...a){
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }
    /*
    create a method called sumVarargs that accepts a variable number of int arguments and returns
     the sum of all the integers.
     Test the method by calling with various arguments
     */
    public static void sumVarargs(int ...b){
        int sum = 0;
        for(int w: b){
            sum=sum+w;
        }
        System.out.println("sum = " + sum);
    }
    /*
    crate a method called concatenateStrings that accepts a variable number of Strings arguments and returns a
    single String containing all the arguments. Test the method by calling it with various arguments
     */
    public static void concatenateStrings(String ...a){
        String singleString = "";
        for(String w: a){
            singleString=singleString+w;
        }
        System.out.println("singleString = " + singleString);
    }
    // functions to find the maximum value among a variable number if input arguments using varargs.
    public static void maximumVarargs(int ...b){

        Arrays.sort(b);
        System.out.println("Maximum Argument: = "+b[b.length-1]);
    }


}
