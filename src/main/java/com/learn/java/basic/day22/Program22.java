package com.learn.java.basic.day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *    List -> duplicate item
 *
 *    Set  -> it doesn't contains duplicate item
 *
 *
 */


public class Program22 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(10);
        myList.add(10);
        myList.add(10);
        myList.add(10);


        for (int temp : myList){
            System.out.println(temp);
        }

        Set<Integer> mySet = new HashSet<>();

        System.out.println(mySet.add(100));
        System.out.println(mySet.add(100));
        mySet.add(100);
        mySet.add(100);
        mySet.add(100);
        mySet.add(200);


        for (int temp : mySet){
            System.out.println(temp);
        }

    }
}
