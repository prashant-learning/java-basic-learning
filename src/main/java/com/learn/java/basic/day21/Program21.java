package com.learn.java.basic.day21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program21 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        /**
         *     Stream feature
         *
         *
         *   create an array of size 16
         *   arrayList.add(1)
         *   arrayList.add(2)
         *   arrayList.add(3)
         *   arrayList.add(4)
         *   ......
         *   arrayList.add(16)    [1,2,3,4,5,6.......,16]
         *
         *
         *   arrayList.add(17)    [ 1,2,3,4,5,6.......,16,17,                                ]
         *
         *  arrayList.add(18)   [ 1,2,3,4,5,6.......,16,17, 18                           34   ]
         *  ......
         *  arrayList.add(35)   [             1,2,3,4,5,6.......,16,17, 18    ......  34, 35               ]
         *
         *
         *   To avoid that copy again and again we have to use LinkedList
         *
         *
         *     1. peek()
         *     2. pop()
         *     3. push()
         *     4. poll()
         *
         *
         *
         */

        List<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println("************ Adding******************");
        for (int temp: myLinkedList) {

            System.out.println(temp);
        }
        System.out.println("************ Insert******************");

        myLinkedList.add(1,0);  // 1,0,2,3
        myLinkedList.add(3, 0);

        for (int temp: myLinkedList) {

            System.out.println(temp);
        }

        System.out.println("***************** Updating**********************");


        myLinkedList.set(1, 100);
        myLinkedList.set(3, 100);

        for (int temp: myLinkedList) {

            System.out.println(temp);
        }

        System.out.println("***************** fetch **********************");

        myLinkedList.add(5, 6);
        System.out.println(myLinkedList.get(5));


        System.out.println("***************** remove **********************");

        myLinkedList.remove(0);
        for (int temp: myLinkedList) {

            System.out.println(temp);
        }

        System.out.println("***************** finding **********************");

        int findItem = 100;
        int findIndex = -1;

        for(int i =0; i < myLinkedList.size(); i++){

            if(myLinkedList.get(i) == findItem){
                findIndex = i;
                //break;
            }

        }

        System.out.println(findIndex);

        System.out.println(myLinkedList.get(0));




        for (int temp: myLinkedList) {

            System.out.println(temp);
        }
    }
}
