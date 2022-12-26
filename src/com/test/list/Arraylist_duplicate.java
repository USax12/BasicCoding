package com.test.list;

import java.util.*;

public class Arraylist_duplicate {

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(20);
        aList.add(10);
        aList.add(50);
        aList.add(30);
        aList.add(20);
        aList.add(10);

        System.out.println("ArrayList with duplicates: " + aList);
        /*************Using SET*************/
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(aList);

        aList.clear();
        aList.addAll(set);/// add the elements of set with no duplicates to the list
        System.out.println("ArrayList with duplicates removed: " + aList);

        /**********Using new arraylist*********/
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        System.out.println("ArrayList with duplicates: " + list);

        List<Integer> list1 = new ArrayList<Integer>();
        for (int i : list) {
            if (!list1.contains(i)) {
                list1.add(i);
            }
        }
        System.out.println("ArrayList with duplicates removed: " + list1);

    }

}
