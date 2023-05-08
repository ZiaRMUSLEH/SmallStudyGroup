package day0607loops;

public class Loops03 {
    /*
                       *
                      * *
                     * * *
                    * * * *
                   * * * * *
                  * * * * * *
                 * * * * * * *

     */
    public static void main (String[] args) {

        for(int i=1; i<8; i++){
            for(int j = 8-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
