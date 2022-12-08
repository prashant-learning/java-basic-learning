package com.learn.java.basic.day13;



//Custom exception  with checked

public class UserCredNotMatchingException extends Exception{

    public UserCredNotMatchingException(){
        super("Yeah am a checked exception");
    }
}
