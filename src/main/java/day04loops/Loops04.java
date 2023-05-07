package day04loops;

import java.util.Scanner;

public class Loops04 {
    // ask the user to enter as many numbers as they want
    // if the sum of the numbers entered by the user exceeds 500
    // now you have entered enough numbers, the total is.....

    public static void main (String[] args) {

        int sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("please enter a number");
            sum = sum+input.nextInt();

        }
            while (sum<=500);

        System.out.println("you have entered enough numbers now, the sum is: "+sum);


    }
}
