package day03scannerifelse;

import java.util.Scanner;

public class IfElse02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("you are eligible");
        } else {
            System.out.println("sorry you are not eligible");
        }
    }


}
