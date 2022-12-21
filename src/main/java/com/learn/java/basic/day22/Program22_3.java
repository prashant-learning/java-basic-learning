package com.learn.java.basic.day22;

import java.util.Set;
import java.util.TreeSet;

public class Program22_3 {

    public static void main(String[] args) {

        Set<Integer> mySet = new TreeSet<>();

        mySet.add(1);
        mySet.add(100);
        mySet.add(9);
        mySet.add(-10);
        mySet.add(98);
        mySet.add(5);

        for (int temp: mySet){
            System.out.println(temp);
        }

    }
}
