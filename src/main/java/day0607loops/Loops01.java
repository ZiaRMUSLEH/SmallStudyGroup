package day0607loops;

public class Loops01 {
    /*
    nested for loop can be either rectangular or triangle format
    when we want a rectangular, we can specify the outer loop and point for the inner loop end point.
    To give a triangle shape, we make the end point of the inner loop depend on the outer loop initial variable.
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    public static void main (String[] args) {

        for(int i = 1; i<6; i++){
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();}



    }
}
