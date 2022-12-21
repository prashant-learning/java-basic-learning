package com.learn.java.basic.day22;

import java.util.*;

public class Program22_2 {

    public static void main(String[] args) {

        // addAll  ->

        Set<Integer> positiveNumbers = new LinkedHashSet<>();

        positiveNumbers.add(1);
        positiveNumbers.add(2);
        positiveNumbers.add(3);
        positiveNumbers.add(4);

        // [1,2,3,4]
        Set<Integer> negativeInteger = new LinkedHashSet<>();

        negativeInteger.add(-1);
        negativeInteger.add(-2);
        negativeInteger.add(-3);
        negativeInteger.add(-4);
        //[-1,-2,-3,-4]

      //  [1,2,3,4,-1,-2,-3,-4]

        positiveNumbers.addAll(negativeInteger);


        System.out.println(positiveNumbers.size());
        // clear

       // positiveNumbers.clear();



        System.out.println(positiveNumbers.size());

        // remove with object or value
       // positiveNumbers.remove(-1);


        for (int temp: positiveNumbers){
            System.out.println(temp);
        }

        // contains

       boolean check = positiveNumbers.contains(1);

        System.out.println(check);


        // containsAll

        // positiveNumber  -> [1,2,3,4,-1,-2,-3,-4]

        List<Integer> myList = new ArrayList<>();


        myList.add(1);
        myList.add(-1);

        // [1,-1]

        boolean check1 = positiveNumbers.containsAll(myList);
        System.out.println(check1);

        // isEmpty

       // positiveNumbers.clear();
        System.out.println(positiveNumbers.isEmpty());


        // Interator

        Iterator iterator = positiveNumbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**********************removeAll*********************");
        // removeAll

        List<Integer> my2List = new ArrayList<>();
        my2List.add(2);
        my2List.add(-2);
        my2List.add(4);
        my2List.add(-4);

        // [2, -2, 4, -4]

       // positiveNumbers.removeAll(my2List);


        positiveNumbers.retainAll(my2List);

       for (int temp: positiveNumbers){
           System.out.println(temp);
       }

       // retainAll








    }
}
