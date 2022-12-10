package com.learn.java.basic.day14;

public class StudentNoFoundException extends Exception {

    StudentNoFoundException(){
        super("student not found");
    }
}
