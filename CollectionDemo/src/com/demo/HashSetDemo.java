package com.demo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[]args){

        HashSet hashSet = new HashSet();
        hashSet.add("Sahil");
        hashSet.add("Nayan");
        hashSet.add("Rohit");
        hashSet.add("Kumar");
        hashSet.add("Aman");
        System.out.println("Without Sorting>> "+hashSet);

        TreeSet treeSet = new TreeSet<>(hashSet);
        System.out.println("After Sorting>> "+treeSet);

    }
}
