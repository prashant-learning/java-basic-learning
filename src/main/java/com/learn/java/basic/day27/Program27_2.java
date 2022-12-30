package com.learn.java.basic.day27;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Program27_2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomGenerator randomGenerator = new RandomGenerator();  // create object for the class implementing callable

        FutureTask ft1 = new FutureTask<>(randomGenerator);   // Create future Task
        FutureTask ft2 = new FutureTask<>(randomGenerator);

        Thread th1 = new Thread(ft1);    // create thread with help of future task
        Thread th2 = new Thread(ft2);


        th1.start();
        th2.start();



        System.out.println(ft2.isDone());   // false
        System.out.println(ft2.get());
        System.out.println(ft2.isDone());   // true


    }
}
