package com.demo;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Mike");
        map.put(50, "Ron");
        map.put(80, "Harry");
        map.put(10, "Albus");
        map.put(40, "Drake");

        System.out.println("Without shorting>> "+map);

        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

    }
}
