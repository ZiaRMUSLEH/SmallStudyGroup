package day04loops;

public class Loops03 {
    //print odd and even numbers up to (inclusive) 100 with two separate loops.
    public static void main (String[] args) {

        for (int i = 1; i<101; i++){
            if (i%2==0){
            System.out.println(i+" is even number");}
        }
        System.out.println();
        for (int i = 1; i<101; i++){
            if (i%2!=0){
                System.out.println(i+" is odd number");}
        }

    }
}
