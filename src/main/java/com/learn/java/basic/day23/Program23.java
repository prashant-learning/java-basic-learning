package com.learn.java.basic.day23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *    Queue  ->  real life example is ticket counter
 *
 *    Queue is also a collection of element(int, long, double, string) which are stored and accessible
 *
 *
 *     FIFO  -> First in First out  -> added from the back and removed from the front
 *
 *     Queue is an Interface
 *
 *       1. ArrayDeque
 *       2. LinkedList
 *       3. PriorityQueue
 *       4. Blocking queue
 *
 *      // vasu -> shankar  -> ravi  -> chandra  -> prashant
 *
 *
 *     // poll, peek , offer
 */


public class Program23 {

    public static void main(String[] args) {

        Queue<String> personOnCounter = new LinkedList<>();


        System.out.println(personOnCounter.peek());  // fail safe
       // System.out.println(personOnCounter.element());
        personOnCounter.offer("Vasu");
        personOnCounter.offer("Shankar");
        personOnCounter.offer("ravi");
        personOnCounter.offer("chandra");
        personOnCounter.offer("prashant");


        System.out.println(personOnCounter.size());
        System.out.println(personOnCounter.element());
        System.out.println(personOnCounter.size());

        // peek   -> just returning the element
        System.out.println(personOnCounter.peek());
        System.out.println(personOnCounter.peek());
        System.out.println(personOnCounter.peek());
        System.out.println(personOnCounter.peek());


        System.out.println("***********************************");
//        // poll
//        System.out.println(personOnCounter.poll());
//        System.out.println(personOnCounter.poll());
//        System.out.println(personOnCounter.poll());
//        System.out.println(personOnCounter.poll());
//        System.out.println(personOnCounter.poll());
//
//        System.out.println(personOnCounter.poll());



        for (String temp: personOnCounter){
            System.out.println(temp);
        }

        Iterator<String> itr = personOnCounter.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
