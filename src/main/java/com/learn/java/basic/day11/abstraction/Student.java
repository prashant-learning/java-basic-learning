package com.learn.java.basic.day11.abstraction;

/**
 *
 *   all variable ar at class scope  -> we call it as instance variable
 *
 *
 *    we should create getter method -> to access the values
 *
 *    We should create setter method  -> to set the values
 *
 */


public class Student {

    private int rollNumber;
    private String studentName;
    private String classTeacherName;
    private int classRoom;


    private static String headMaster = "Vashu";

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public static String getHeadMaster() {
        return headMaster;
    }

    public static void setHeadMaster(String headMaster) {
        Student.headMaster = headMaster;
    }
}
