package com.learn.java.basic.day27;



// join, isAlive, suspend, resume,
public class NumberPrinter extends Thread{


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + " thread and the printer number is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
