package com.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String args[]) {
        List<String> Arr = new ArrayList<>();
        //ArrayList<String> Arr = new ArrayList<>(); we can use return type as List or ArrayList both
        // addd

        Arr.add("Utkarsh");
        Arr.add("Ishu");
        Arr.add("Ajeet");
        Arr.add("Harry");

        System.out.println("List of names:");
        for (String str : Arr)
            System.out.println(str);

        Arr.add(1, "Rahul"); // start with 0

        System.out.println("After addition:");
        for (String Str : Arr)
            System.out.println(Str);

        Arr.remove("Harry");
        Arr.remove(2);

        System.out.println("After Delete");
        for (String Str : Arr)
            System.out.println(Str);

        System.out.println("After Set");
        Arr.set(2, "Singh");
        for (String Str : Arr)
            System.out.println(Str);

        int pos = Arr.indexOf("Rahul");
        System.out.println("Index of Rahul:" + pos);
        int pos1 = Arr.indexOf("Harry");
        System.out.println("Index of Harry:" + pos1);//-1 if element not found

        String val = Arr.get(2);
        System.out.println("Value at index:" + val);

        int size = Arr.size();
        System.out.println("Size:" + size);

        Collections.reverse(Arr);
        System.out.println("printing list in reverse order....");
        for (String Str : Arr)
            System.out.println(Str);

        Collections.sort(Arr);
        System.out.println("printing list after Sorting....");
        for (String str : Arr)
            System.out.println(str);

    }


}