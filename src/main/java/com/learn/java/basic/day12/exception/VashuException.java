package com.learn.java.basic.day12.exception;

public class VashuException extends Exception{

    public VashuException(String errorMsg){
        super("This is Vashu exception " + errorMsg);
    }
}
