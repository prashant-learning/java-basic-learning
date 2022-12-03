package com.learn.java.basic.day11.abstraction;

public class ProgramAbstraction {


    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

      //  student.rollNumber = 19;

        student1.setRollNumber(1);

        student2.setRollNumber(50);

        System.out.println(student2.getRollNumber());
        System.out.println(student2.getHeadMaster());
        System.out.println(student1.getHeadMaster());

        student2.setHeadMaster("Shankar");

        System.out.println(student2.getHeadMaster());
        System.out.println(student1.getHeadMaster());
    }
}
