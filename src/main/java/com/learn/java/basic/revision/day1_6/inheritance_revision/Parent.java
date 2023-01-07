package com.learn.java.basic.revision.day1_6.inheritance_revision;

public class Parent extends GrandParent{


    public int getAccountDetails(){

        return super.getAccountDetails() + 100;
    }
}
