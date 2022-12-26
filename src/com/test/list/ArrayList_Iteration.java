package com.test.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iteration {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        /* For Loop for iterating ArrayList */
        System.out.println("For Loop");
        for (int counter = 0; counter < arrlist.size(); counter++) {
            System.out.print(arrlist.get(counter));
        }

        /* Advanced For Loop*/
        System.out.println("\nAdvanced For Loop");
        for (Integer num : arrlist) {
            arrlist.remove(1);
            System.out.print(num);
        }

        /* While Loop for iterating ArrayList*/
        System.out.println("\nWhile Loop");
        int count = 0;
        while (arrlist.size() > count) {
            System.out.print(arrlist.get(count));
            count++;
        }

        /*Looping Array List using Iterator*/
        System.out.println("\nIterator");
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}