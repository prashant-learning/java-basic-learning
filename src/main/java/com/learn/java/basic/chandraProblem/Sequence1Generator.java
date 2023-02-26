package com.learn.java.basic.chandraProblem;

public class Sequence1Generator extends Thread{

    @Override
    public void run() {

        for (int i =1; i <= 10; i++ ){
            System.out.println(i);
        }
    }
}
