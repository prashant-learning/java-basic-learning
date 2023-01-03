package com.learn.java.basic.day27;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Program27_2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomGenerator randomGenerator = new RandomGenerator();  // create object for the class implementing callable

        FutureTask ft1 = new FutureTask<>(randomGenerator);   // Create future Task
        FutureTask ft2 = new FutureTask<>(randomGenerator);
        FutureTask ft3 = new FutureTask<>(randomGenerator);
        FutureTask ft4 = new FutureTask<>(randomGenerator);
        FutureTask ft5 = new FutureTask<>(randomGenerator);
        FutureTask ft6 = new FutureTask<>(randomGenerator);
        FutureTask ft7 = new FutureTask<>(randomGenerator);

        Thread th1 = new Thread(ft1);    // create thread with help of future task
        Thread th2 = new Thread(ft2);
        Thread th3 = new Thread(ft3);
        Thread th4 = new Thread(ft4);
        Thread th5 = new Thread(ft5);
        Thread th6 = new Thread(ft6);
        Thread th7 = new Thread(ft7);


        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();



        System.out.println(ft2.isDone());   // false
        System.out.println(ft6.get());
        System.out.println(ft2.isDone());   // true


    }
}
