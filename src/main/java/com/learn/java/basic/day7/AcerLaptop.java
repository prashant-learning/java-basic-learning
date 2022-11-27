package com.learn.java.basic.day7;

public class AcerLaptop implements Computer{

    @Override
    public int getRamSize(){
        return 8;
    }

    @Override
    public int getHDDSize(){
        return 250;
    }
}
