package day03scannerifelse;

import java.util.Scanner;

public class Scanner02 {
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        hiStatement();

    }

    public static void hiStatement (){

        String name = input.nextLine();
        System.out.println("Hi " + name + " how are you");
    }
}
