package com.learn.java.basic.chandraProblem;

public class Problem2 {

    public static void main(String[] args) throws InterruptedException {

        Sequence1Generator thread1 = new Sequence1Generator();
        Sequence2Generator thread2 = new Sequence2Generator();
        Sequence3Generator thread3 = new Sequence3Generator();


        thread1.start();

        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
    }
}
