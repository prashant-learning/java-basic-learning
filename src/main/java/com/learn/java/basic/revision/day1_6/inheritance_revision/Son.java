package com.learn.java.basic.revision.day1_6.inheritance_revision;

public class Son extends Parent{

    public int getAccountDetails(){

        return super.getAccountDetails() + 2000;
    }
}
