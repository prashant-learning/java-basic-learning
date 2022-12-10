package com.learn.java.basic.day10.superConstructor;

public class Animal {


    // Instance variable
    int legs;
    String type;

    //default constructor
    public Animal(){

    }

    // parameterised constructor
    public Animal(int legs, String type){
        this.legs = legs;
        this.type = type;
    }

    public String getAnimalType(){

        return type;
    }
}
