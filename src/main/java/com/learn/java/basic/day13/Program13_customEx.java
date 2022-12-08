package com.learn.java.basic.day13;

public class Program13_customEx {

    public static void main(String[] args) {


        String employeeName = "ABC";

        //  In DB we don't have the employee

        try {
            myFunction();
        } catch (UserCredNotMatchingException ex){

        }

    }


    public static void myFunction() throws UserCredNotMatchingException{

        try {

            throw  new UserCredNotMatchingException();

        }catch (EmployeeNotFoundException ex){

        }

    }
}
