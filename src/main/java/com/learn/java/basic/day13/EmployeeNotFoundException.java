package com.learn.java.basic.day13;


//Custom exception  with unchecked


public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(){
        super("Employee doesn't exist in the database");
    }

}
