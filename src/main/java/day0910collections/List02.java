package day0910collections;

public class List02 {
    public static void main (String[] args) {
        char[] myArray = {'a','b','a'};
        System.out.println(isPerfectArray(myArray));
    }

        /*
        given an array of size N and you have to tell whether the array is perfect or not. An array is said perfect
         if its reverse array matches the original array. If the array is perfect then return true else return false.
         */

public static boolean isPerfectArray (char arr[]) {
    int arraySize = arr.length;
    for (int i = 0; i < arraySize - 1; i++) {
        if (arr[i] != arr[arr.length - 1 - i]) {
            return false;
        }}
        return true;



}

}
