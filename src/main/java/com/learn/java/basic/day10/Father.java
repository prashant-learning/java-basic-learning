package com.learn.java.basic.day10;


/**
 *   Super is a keyword   ->  which refers to immediate parent class object
 *
 *   1. We can invoke immediate parent instance variable   -> completed
 *   2. We can invoke immediate parent method   -> completed
 *   3. We can invoke immediate parent constructor
 */


public class Father extends GrandFather{

    int age = 50;

    public int getBankAccountDetails(){

        int ancestorMoney =  super.getBankAccountDetails();

        System.out.println(ancestorMoney);
        return 2432342;
    }


}
