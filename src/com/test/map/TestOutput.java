package com.test.map;

import java.util.HashMap;

public class TestOutput {
    public static void main(String args[]) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('A', 100);
        map.put('B', 200);
        map.put('C', 300);
        map.put('A', 400);

        System.out.println(map.get('A')); //400

    }
}	