package com.learn.java.basic.day12;

/**
 *  Abstract class is a type of class which will have method without implementation
 *
 *  We cannot create an object of an abstract class
 *
 *  We cannot create an object for interface
 *
 *
 *
 *    To create an object of interface we need to create an classs which need to implement the interface
 *    and then we can create object of that implementer class
 *
 *        interface A{
 *
 *        }
 *
 *        class B  implement A
 *
 *        B b = new B()
 *
 *        A a = new A()   not possible
 *
 *        class abstract C
 *
 *        class D extends C
 *
 *        then I create object of D
 *
 *        D d = new D()  possible
 *
 *
 *
 *
 *
 */



public abstract class Animal {

    public abstract String sounds();

    public static String animalType(){
        return "am an animal type";
    }

}
