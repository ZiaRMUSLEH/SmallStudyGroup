package day04loops;

public class Loops02 {
    public static void main (String[] args) {

        // write a program Between 10 and 30 (including 10 and 30)
        // print numbers on the same line with comas between them ,10,11,12,......30

        for(int i = 10; i<31; i++){
            System.out.print(i);
            if (i!=30){
                System.out.print(", ");
            }
        }


    }
}
