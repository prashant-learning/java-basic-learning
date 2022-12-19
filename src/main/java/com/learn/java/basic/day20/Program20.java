package com.learn.java.basic.day20;

import java.util.ArrayList;
import java.util.List;

/**
 *   Collections is kind of solution where can manipulate a group of data  (CURD)
 *
 *    Task can be performed :
 *            1. Adding            list.add()
 *            2. Searching         // custom implementation
 *            3. Inserting         list.add(index, value)
 *            4. Deleting          list.remove()
 *            5. Updating          list.set(index, value)
 *            6. Getting / Fetch   list.get()
 *            7. Sorting           // I take in next class
 *
 *
 *    What is java collection framework ?
 *
 *      Ans  -> Java collection framework is to represent a group of elements in classes and interfaces
 *
 */


public class Program20 {

    public static void main(String[] args) {

        // ArrayList      []

        List<Integer> myList = new ArrayList<>();

        myList.add(100);  // [100]
        myList.add(300);  // [100, 300]

        System.out.println(myList.size());


        // [100, 300]
        System.out.println(myList.size());
        System.out.println(myList.get(1));

        // [100, 300]

        // [100, 300, 400, 500]

        System.out.println("************ Adding******************");

        myList.add(400);
        myList.add(500);

        for (int temp : myList) {
            System.out.println(temp);
        }



        System.out.println("***************** Inserting***************** ");

        myList.add(1, 200);  //  // [100, 200, 300, 400, 500]
        for (int temp : myList) {
            System.out.println(temp);
        }

        System.out.println("***************** Updating**********************");
        myList.set(2, 600);   // [100, 200, 600, 400, 500]

        for (int temp : myList) {
            System.out.println(temp);
        }

        System.out.println("*************** Removing ************");

        myList.remove(1);  // [100, 600, 400, 500]

        for (int temp : myList) {
            System.out.println(temp);
        }

        //  find an item from the list -> if item exist then it will return index or else it will return -1

        int findItem = 600;
        int findIndex = -1;
        for (int i =0; i< myList.size(); i++) {

            if(findItem == myList.get(i)){
                findIndex = i;
                break;
            }
        }
        System.out.println(findIndex);


    }
}
