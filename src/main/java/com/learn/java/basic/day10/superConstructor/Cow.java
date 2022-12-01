package com.learn.java.basic.day10.superConstructor;

public class Cow extends Animal{

    String hybrid;

    public Cow(int legs, String type, String hybrid){
       super(legs, type);
       this.hybrid = hybrid;
    }
}
