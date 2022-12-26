package com.test.map;

import java.util.*;
import java.util.Map.Entry;

public class HashMap_Sort {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put(9, "Neelesh");

        System.out.println(hm);
        System.out.println("/**Sorting by key using TreeMap****/ ");
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);

        for (Entry<Integer, String> entry : tm.entrySet())
            System.out.println("Key:" + entry.getKey() + "\t Value:" + entry.getValue());

        /**Sorting by values using comparator****/
        System.out.println("/**Sorting by values using comparator****/ ");
        System.out.println("Before Sorting: \n");
        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Entry element = (Entry) it.next();
            System.out.println("Roll no:  " + element.getKey() + "     Name:   " + element.getValue());
        }

        Map<Integer, String> map = sortByValues(hm);
        System.out.println("After Sorting:");
        Set<Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Entry<Integer, String>> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Entry<Integer, String> me2 = (Entry<Integer, String>) iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }

    }

    private static HashMap<Integer, String> sortByValues(HashMap<Integer, String> map) {

        List<Object> list = new LinkedList<Object>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                // TODO Auto-generated method stub
                return
                        ((Comparable) ((Entry) (o1)).getValue()).compareTo(((Entry) (o2)).getValue());
            }


        });
        //copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap<Integer, String>();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Entry entry = (Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;


    }

}

