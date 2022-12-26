package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());

        System.out.println("Check map is Empty: " + map.isEmpty());
        System.out.println("Size of map is: " + map.size());
        System.out.println("Adding key-value pairs to a HashMap");
        map.put(100, "Utkarsh");
        map.put(101, "Dixit");
        map.put(102, "Khan");
        map.put(103, "");
        map.put(104, "Java");
        map.put(1, "abc");
        map.put(2, null);
        map.put(null, "abc");
        map.put(null, null);
        map.put(5, "xyx");

        System.out.println("Check map is Empty: " + map.isEmpty());
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);


        String name = map.get(102);
        System.out.println("Value of 102" + name);
        map.remove(102);    //value-based removal
        System.out.println("Updated list of elements: " + map);
        map.remove(101, "Dixit");    //key-value pair based removal
        System.out.println("Updated list of elements: " + map);
        map.replace(100, "Saxena");
        System.out.println("Updated list of elements: " + map);

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.print("Key: " + me.getKey() + " & Value: ");
            System.out.println(me.getValue());

        }


    }
}
	
  