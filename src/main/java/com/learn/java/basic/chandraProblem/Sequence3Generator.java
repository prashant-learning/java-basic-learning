package com.learn.java.basic.chandraProblem;

public class Sequence3Generator extends Thread{

    @Override
    public void run() {

        for (int i =21; i <= 30; i++ ){
            System.out.println(i);
        }
    }
}
