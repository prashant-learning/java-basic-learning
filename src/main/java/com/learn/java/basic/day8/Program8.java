package com.learn.java.basic.day8;

public class Program8 {

    public static void main(String[] args) {

        Student student1 = new Student("Shanka", 20,  345.45);

        System.out.println(student1.name);    // c drive

        System.out.println(student1.getRollNo());


        Student student2 = new Student();     // d drive

        System.out.println(student2.name);  // null
        System.out.println(student2.rollNo); // 0
        System.out.println(student2.totalMarksScored); // 0.0

    }
}
