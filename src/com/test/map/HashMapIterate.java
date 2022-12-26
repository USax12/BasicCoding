package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapIterate {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Utkarsh");
        map.put(101, "Dixit");
        map.put(102, "Khan");
        map.put(103, "");
        map.put(104, "Java");

        System.out.println("------------------------------- Normal Print statement ------------");
        System.out.println("\n" + map + "\n");

        System.out.println("------------------------------- Map.entrySet() using For-Each loop------------");

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key =" + entry.getKey() + ", Value =" + entry.getValue());

        System.out.println("------------------------------- using keySet() for iteration over keys--------");

        for (Integer key : map.keySet())
            System.out.println("Key :" + key);

        System.out.println("------------------------------- using values() for iteration over keys--------");
        for (String val : map.values())
            System.out.println("Values :=" + val);

        System.out.println("------------------------------- using iterators ----------------------------");
        Set s = map.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }
}