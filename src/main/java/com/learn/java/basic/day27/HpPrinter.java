package com.learn.java.basic.day27;

/**
 *
 *   Thread class
 *
 *   Runnable Interface
 *
 *
 */


public class HpPrinter extends Printer implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " thread and the printer number is " + i);
        }
    }
}
