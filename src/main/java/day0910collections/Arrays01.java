package day0910collections;

public class Arrays01 {
    public static void main (String[] args) {

        /*
        given an array of size N and you have to tell whether the array is perfect or not. An array is said to be
        perfect if its reverse array matches the original array. if the array is perfect then return True else return
        false.
         */

        int[] strArray = {1,2,1};

        System.out.println("arrayIsPerfectOrNot(strArray) = " + arrayIsPerfectOrNot(strArray));

    }

    public static boolean arrayIsPerfectOrNot (int[] strArray) {
        int n = strArray.length;
        for (int i = 0; i < n; i++) {
            if (strArray[i] != strArray[n - 1 - i]) {
                return false;
            }


        }
        return true;
    }
}

