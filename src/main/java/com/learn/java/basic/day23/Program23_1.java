package com.learn.java.basic.day23;

import java.util.PriorityQueue;

public class Program23_1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbersPriority = new PriorityQueue<>();

        numbersPriority.add(4);
        numbersPriority.add(2);
        numbersPriority.add(3);
       // numbersPriority.add(1);

        for (int temp : numbersPriority){
            System.out.println(temp);
        }
    }
}
