package com.learn.java.basic.day8;

/**
 * Compile will always gives you a default constructor -> default constructor doesn't takes any parameter as input
 * <p>
 * <p>
 * public Student(){
 * <p>
 * }
 */

public class Student {

    String name;
    int rollNo;
    double totalMarksScored;

    public Student() {

    }

    public Student(String name, int rollNo, double totalMarksScored) {

        this.name = name;
        this.totalMarksScored = totalMarksScored;
        this.rollNo = rollNo;

    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {

        return this.rollNo;

    }


}
