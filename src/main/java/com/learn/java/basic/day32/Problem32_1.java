package com.learn.java.basic.day32;


import java.util.*;

public class Problem32_1 {

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        Queue<Integer> myQueue = new LinkedList<>();

        // name and how much they have scored
        // Map<Integer -> key type , Integer -> value type>
        Map<String , Integer> myMap = new LinkedHashMap<>();



        myMap.put("Prashant", 80);
        myMap.put("Shankar", 90);
        myMap.put("Ravi", 89);
        myMap.put("Chandra", 99);

        Set<String> nameOfStudent = myMap.keySet();

        for (String name: nameOfStudent){
            System.out.println(name);
        }

        Collection<Integer> values = myMap.values();
        for (Integer marks: values){
            System.out.println(marks);
        }


        Set<Map.Entry<String, Integer>> entries = myMap.entrySet();

        for (Map.Entry<String, Integer> temp : entries){

            System.out.println("name is  " + temp.getKey() + " and the marks scored  is " + temp.getValue());
        }
        myMap.clear();

        System.out.println(myMap.isEmpty());

        System.out.println(myMap.getOrDefault("Chandra", -100));

        // size
        System.out.println(myMap.size());

    }
}
