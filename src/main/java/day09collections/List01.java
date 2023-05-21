package day09collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List01 {
    public static void main (String[] args) {

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(4);
        alist.add(5);
        alist.add(45);
        alist.add(523);
        System.out.println("alist = " + alist);
        alist.add(4);
        alist.add(5);
        alist.add(45);
        alist.add(523);
        System.out.println("alist = " + alist);

        Set<Integer> slist = new HashSet<>();
        slist.add(4);
        slist.add(5);
        slist.add(45);
        slist.add(523);
        System.out.println("slist = " + slist);
        slist.add(4);
        slist.add(5);
        slist.add(45);
        slist.add(523);
        System.out.println("slist = " + slist);

    }
}
