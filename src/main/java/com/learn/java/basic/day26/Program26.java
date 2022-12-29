package com.learn.java.basic.day26;


/**
 *    MultiThreading -> Multiple threads to work / process simultaneously
 *
 *    Thread -> Thread is lightweight sub-process
 *
 *
 *
 *     How to create Thread ?
 *         1. By extending Thread Class
 *         2. By implementing Runnable class
 *         3. By implementing callable class
 *
 *         3. Executor Service
 *
 *
 */
public class Program26 {

    public static void main(String[] args) {

        Thread shankarThread = new TicketBooking();  // create a thread   -> new stage of thread life cycle


        Thread chandraThread = new TicketBooking();  // create a thread   -> new stage of thread life cycle


        shankarThread.setName("shankar");
        chandraThread.setName("chandra");

        shankarThread.setPriority(1);

        shankarThread.start();                       // thread moves to runnable stage
        chandraThread.start();                       // thread moves to runnable stage

      //  System.out.println(Thread.currentThread().getName());

        System.out.println( "Thread priority for " + Thread.currentThread().getName() + " ----- " +Thread.currentThread().getPriority());






    }
}
