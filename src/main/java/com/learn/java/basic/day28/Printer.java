package com.learn.java.basic.day28;

public class Printer implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing and will return the value from printer");
    }
}
