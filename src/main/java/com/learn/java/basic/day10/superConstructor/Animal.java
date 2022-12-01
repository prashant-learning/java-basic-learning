package com.learn.java.basic.day10.superConstructor;

public class Animal {

    int legs;
    String type;

    public Animal(){

    }

    public Animal(int legs, String type){
        this.legs = legs;
        this.type = type;
    }

    public String getAnimalType(){

        return type;
    }
}
