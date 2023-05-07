package day05loops;

public class Loops01 {
    /*
    Write a program that prints the below figure with a nested loop.
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
     */
    public static void main (String[] args) {

        for(int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
