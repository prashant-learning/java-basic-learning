package com.learn.java.basic.day22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program22_1 {

    public static void main(String[] args) {


        // Hashset         -> doesn't maintain the order
        // LinkedHashSet   -> maintains the order
        Set<String> myData = new HashSet<>();

        myData.add("HDF");
        myData.add("LOVE");
        myData.add("MY");
        myData.add("AA");

        for (String temp : myData){
            System.out.println(temp);
        }


        System.out.println("*********************************************************");
        Set<String> myData1 = new LinkedHashSet<>();

        myData1.add("HDF");
        myData1.add("LOVE");
        myData1.add("MY");
        myData1.add("AA");

        for (String temp : myData1){
            System.out.println(temp);
        }
    }
}
