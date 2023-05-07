package day05loops;

public class Loops02 {
    /*
    Type codes to draw the following image by using a for loop.
    A A A A A A A A
    A X X X X X X A
    A X X X X X X A
    A X X X X X X A
    A A A A A A A A
     */

    public static void main (String[] args) {

        for(int i = 0; i<5; i++){
            for(int j = 0; j<8; j++){
                if (j>0 && j<7 && i>0 && i<4 ){
                    System.out.print("X ");
                }else
                {System.out.print("A ");}
            }

            System.out.println();
        }

    }
}
