package day11ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main (String[] args) {



    ArrayList<Integer> l3 = new ArrayList<>();
    l3.add(5);
    l3.add(8);
    l3.add(5);
    l3.add(65);
    l3.add(14);
    l3.add(4);

        int i = 0;

        for (Integer w:l3) {

            l3.set(i, w+2);
            i++;
        }
        System.out.println(l3);

}}
