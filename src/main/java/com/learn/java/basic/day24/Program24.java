package com.learn.java.basic.day24;

import java.util.*;

/**
 *   Map part of collection  -> it doesn't extends collection interface
 *
 *   Key -> value
 *
 *   "vasu" -> "500000$",   -> entry  ? -> entry in map
 *
 *   "Shankar" -> "5345345"   -> Key should be unique
 *
 *
 *
 */



public class Program24 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        // Whe we use HashMap the order is not preserved
       // Map<String, Integer> nameWorthMap = new HashMap<>();

        // We can preserved the insertion order in map using linked hashmap
        Map<String, Integer> nameWorthMap = new HashMap<>();

        nameWorthMap.put("XBC", 324234);
        nameWorthMap.put("BYZ", 7634534);
        nameWorthMap.put("QWE", 534534);

        // Avoid doing this
        nameWorthMap.put(null, 0);
        nameWorthMap.put(null, 323);

        nameWorthMap.putIfAbsent("XBC", 0);

        System.out.println(nameWorthMap);

        nameWorthMap.remove("XBC");

        System.out.println(nameWorthMap);

        Map<String, Integer> secondMap = new HashMap<>();

        secondMap.put("ABC", 23423);
        secondMap.put("WER", 345345);
        secondMap.put("TYR", 56324);

        nameWorthMap.putAll(secondMap);

        System.out.println(nameWorthMap);

        System.out.println(nameWorthMap.get("ABC"));

        // old fashion -> old is gold

        Set<Map.Entry<String, Integer>> entries = nameWorthMap.entrySet();

        Iterator iterator = entries.iterator();

        while (iterator.hasNext()){

           Map.Entry<String , Integer> entry =  (Map.Entry) iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        System.out.println("***********************************************");

        // new style // syntactically sugar syntax

        for(Map.Entry temp  : nameWorthMap.entrySet()){

            System.out.println(temp.getKey() + " -> " + temp.getValue());

        }

        System.out.println("***********************************************");


        Set<String> nameSet =   nameWorthMap.keySet();

        for (String temp: nameSet){
            System.out.println(temp);
        }

        System.out.println("***********************************************");

        List<Integer> worth = new ArrayList<>(nameWorthMap.values());

        for (int temp: worth){
            System.out.println(temp);
        }

        System.out.println("***********************************************");

        System.out.println(nameWorthMap.containsKey("ABC"));
        System.out.println(nameWorthMap.containsValue(234243));
        System.out.println(nameWorthMap.size());

        System.out.println("***********************************************");


        // isEmpty

        nameWorthMap.clear();

        System.out.println(nameWorthMap.isEmpty());

        // containsKey



    }
}
