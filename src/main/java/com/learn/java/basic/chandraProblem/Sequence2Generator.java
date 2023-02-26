package com.learn.java.basic.chandraProblem;

public class Sequence2Generator extends Thread{

    @Override
    public void run() {

        for (int i =11; i <= 20; i++ ){
            System.out.println(i);
        }
    }
}
