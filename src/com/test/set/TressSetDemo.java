package com.test.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TressSetDemo {
    public static void main(String args[]) {
        //TreeSet <String>t = new TreeSet<String>(new MyComparator());
        TreeSet<String> t = new TreeSet<String>();
        t.add("u");
        t.add("t");
        t.add("K");
        t.add("a");
        t.add("r");
        t.add("s");
        t.add("h");
        //t.add(new StringBuffer("AD"));
        // We will get RunTimeException :ClassCastException
        // As StringBuffer does not implements Comparable interface  that why we use Comparator method
        // and even StringBuffer cannnoty be converted to String as we have passed String while creating String (argument mismatch)

        //System.out.println("Set before using the comparator: "+ t);
        System.out.println(t);
		
		/*System.out.println("The elements sorted in descending"+ 
        "order:"); 
        for (String element : t) 
            System.out.print(element + " "); */

    }
}

class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return s1.compareTo(s2);
    }
}	
		