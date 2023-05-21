package day13stingbuildersstringbuffer;

import java.util.Arrays;
import java.util.Collections;

public class SB01 {
    public static void main (String[] args) {

        //write a java program to concatenate two Strings using StringBuilder

        String a = "ziarahman";
        String b = " MUSLEH";

        StringBuilder c = new StringBuilder(a);
        c.append(b);
        System.out.println(c);

        //write a java program to insert a given string into a specific position of another string using StringBuilder

        String str1 = "Hello World";
        String str2 = " I'm learning Java";
        StringBuilder strB = new StringBuilder();
        strB.append(str1);
        strB.insert(5,str2);
        System.out.println("strB = " + strB);

        //how long is the string returned by the substring method? what string is returned?
        StringBuilder sb3 = new StringBuilder("was it a car or a cat i saw?");
        System.out.println("sb3.subSequence(9,12) = " + sb3.substring(9, 12));

        //write a program that prints your initials from your full name and displays them. using StringBuffer

        String myName = "Fred zia as td";
        String[] myNamearr = myName.trim().replaceAll("[^a-zA-Z\\s]", "").split(" ");
        StringBuffer initials = new StringBuffer();
        for (String w: myNamearr){
                char initial = w.charAt(0);
                initials.append(initial);
        }

        System.out.println("initials = " + initials);

        //write a program to reverse the order of words in a string using stringBuilder.

        String input = "Hello world welcome to java programming";
        StringBuilder output = new StringBuilder();

        String[] inputarr = input.trim().split(" ");

        for(String w: inputarr){
            output.insert(0,w+" ");
        }
        System.out.println(output);


    }

}

