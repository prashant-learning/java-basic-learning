package com.learn.java.basic.day27;

public class Program27_1 {

    public static void main(String[] args) {

        HpPrinter hpPrinter = new HpPrinter();   // create object of class which is implementing runnable

        Thread th1 = new Thread(hpPrinter);
        Thread th2 = new Thread(hpPrinter);   // create thread with help of runnable object

        th1.setName("HP printer 1");
        th2.setName("HP printer 2");

        th1.start();
        th2.start();
    }
}
