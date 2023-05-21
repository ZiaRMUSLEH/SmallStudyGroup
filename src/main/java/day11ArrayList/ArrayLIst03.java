package day11ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIst03 {
    /*
    delete the desired elements (how many) from a given array and leave the rest
    create a method that prints is as a new list.
     */

    public static void main (String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(5);
        nums.add(6);
        nums.add(1);
        nums.add(7);
        nums.add(7);

       deleteUnWantedElement(nums, 5);


    }

    public static void deleteUnWantedElement (List<Integer> nums, int unWantedElement){

        List<Integer> nums1 = new ArrayList<>();
        for (Integer w: nums) {
            if (w>unWantedElement){
                nums1.add(w);
            }
        }
        System.out.println(nums1);
    }
}
