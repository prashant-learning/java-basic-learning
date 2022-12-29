package com.learn.java.basic.day26;

public class PrintingThread extends Thread{

    @Override
    public void run(){

        for (int i = 0 ; i < 100; i++){
            System.out.println(i +   " ******************************");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
