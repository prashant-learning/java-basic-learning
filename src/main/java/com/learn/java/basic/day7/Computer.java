package com.learn.java.basic.day7;

/**
 *
 * Java 7 concepts
 *
 * No implemenation means abstract method
 *
 * Variable inside an interface will be public static and final
 *
 * final on a variable means  -> we cannot change the value of the variable
 *
 * You cannot create object of interface, objects can be created only for class
 *
 */

public interface Computer {

   String hardwareOperatingType = "64bit";   // public static and final

    public int getRamSize();

    public int getHDDSize();

}
