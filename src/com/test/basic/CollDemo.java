package com.test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CollDemo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("U");
        al.add("T");
        al.add("K");
        al.add("A");
        al.add("R");
        al.add("S");
        al.add("H");
        System.out.println(":Before Sorting" + al);
        Collections.sort(al);
        System.out.println(":After Sorting" + al);
        Collections.reverse(al);
        System.out.println("Reverse" + al);
        
        List<Integer> a= Arrays.asList(1,2,3,4);
    }
}	
		