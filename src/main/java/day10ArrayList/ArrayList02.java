package day10ArrayList;

import java.util.*;

public class ArrayList02 {

    /*
    write program to print unique elements of list
    with method
    ex: [1,3,5,3,5,6,1,7]
    [1,3,5,6,7]
     */
    public static void main (String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        nums.add(1);
        nums.add(7);
        nums.add(7);
        nums.add(7);
        nums.add(7);
        nums.add(7);
        System.out.println(createUniqueList(nums));


    }
public static List<Integer> createUniqueList (List<Integer> nums)
    {
        List<Integer> uniqueNums = new ArrayList<>();
        for (Integer w : nums) {
            if (!uniqueNums.contains(w)) {
                uniqueNums.add(w);
            }
        }
        return uniqueNums;
    }
}
