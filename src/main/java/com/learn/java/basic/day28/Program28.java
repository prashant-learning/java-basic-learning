package com.learn.java.basic.day28;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 *
 *    Executor  ->  to create a thread pool
 *    ExecutorService  ->
 *
 *   To avoid creating as many as thread required bsaed on the request we should have thread pool   ->  ExecutorService
 *
 *   execute
 *   submit
 *   invokeAll    ->   List of callable / Runnable
 *   invokeAny
 *
 *
 */
public class Program28 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService =  Executors.newFixedThreadPool(3);   // create a thread pool with specified number of thread
       // ExecutorService executorService =  Executors.newCachedThreadPool();


        List<Callable<Object>> tasks = new ArrayList<>();

        tasks.add(new RandomGenerator()); //
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());
        tasks.add(new RandomGenerator());

        executorService.invokeAll(tasks);// starts all the tasks (thread) added in the list
        executorService.invokeAny(tasks);


        Printer printer = new Printer();
        executorService.execute(printer);   // execute a single runnable thread



        executorService.submit(new RandomGenerator());  // execute a single callable or runnable thread
        executorService.submit(new Printer());

        System.out.println(executorService.isShutdown());

        executorService.shutdown();

        System.out.println(executorService.isShutdown());




    }
}
