package com.learn.java.basic.chandraProblem;

import java.util.*;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 75);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        System.out.println(scores);
        Map<String, Integer> sortedMap = sortMapByValueByStream(scores);
        System.out.println(sortedMap);
    }

    /**
     *   Map { ("david", 95), (Jane, 80), () ()}
     *
     *   List<Entry>   [("david", 95), (Jane, 80), (Mary, 75)]
     *
     *   sort the list od enry
     *      [ (Mary, 95),(Jane, 80), ("david", 95)]
     *   create a new map from this sorted list
     *
     *   {}
     *
     *
     */
    private static Map<String, Integer> sortMapByValue(HashMap<String, Integer> scores) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(scores.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Map -> is based on hashing so the order is not preserved
        // Top preserve the order we need to create a Linked hash map
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> temp: list) {

            sortedMap.put(temp.getKey(), temp.getValue());
        }
        return sortedMap;
    }


    private static Map<String, Integer> sortMapByValueByStream(HashMap<String, Integer> scores) {

       Map<String, Integer> sortedMap = scores
               .entrySet()
               .stream()
               .sorted((o1, o2) ->
                     o1.getValue().compareTo(o2.getValue())
               )
               .collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry::getValue,(a, b) -> b, LinkedHashMap::new));
       return sortedMap;



    }
}
