package day03scannerifelse;

import java.util.Scanner;

public class IfElse01 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String day = "Sunny";
        if(day.equals("Sunny")){
            System.out.println("T-shorts");
        } else if (day.equals("Cloudy")){
            System.out.println("Get your umbrella");
        } else {
            System.out.println("Not sure");
        }







    }
}

