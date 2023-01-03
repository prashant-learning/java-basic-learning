package com.learn.java.basic.day28;

import java.util.concurrent.Callable;

public class RandomGenerator implements Callable {


    @Override
    public Object call() throws Exception {

        System.out.println(Thread.currentThread().getName() + " is executing and will return the value");

       // Thread.sleep(5000);
        return Math.random();
    }

}
