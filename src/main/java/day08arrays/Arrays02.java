package day08arrays;

public class Arrays02 {
    public static void main (String[] args) {
        // print the sum of the elements of an array on the console
        int array [] = {4,5,6,7,5,2,1};
        int sumOfArrayElments = 0;
        for(int w: array){
            sumOfArrayElments=sumOfArrayElments+w;
        }
        System.out.println("sumOfArrayElments = " + sumOfArrayElments);

        // print the even and odd numbers of an array on the console

        for(int w: array){
            if(w%2==0){
                System.out.println("Even: "+w);
            }
            else {System.out.println("Odd: "+w);}
        }
    }
}
