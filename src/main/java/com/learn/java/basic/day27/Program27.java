package com.learn.java.basic.day27;

public class Program27 {

    public static void main(String[] args) throws InterruptedException {


        NumberPrinter th1 = new NumberPrinter();
        NumberPrinter th2 = new NumberPrinter();
        NumberPrinter th3 = new NumberPrinter();

        th1.setName("Printer 1");
        th2.setName("Printer 2");
        th3.setName("Printer 3");


        th1.start();
        th1.join(); //
        System.out.println("We will execute after thread 1 is completed");
        System.out.println(th1.isAlive());
        th2.start();
        th3.start();
        System.out.println(th2.isAlive());
      //  th1.join();

    }
}
