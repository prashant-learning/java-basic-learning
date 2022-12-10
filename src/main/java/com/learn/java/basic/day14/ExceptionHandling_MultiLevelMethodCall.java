package com.learn.java.basic.day14;

public class ExceptionHandling_MultiLevelMethodCall {

    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.getStudentAndCollegeGrade("Invalid", "Invalid");
        } catch (StudentNoFoundException | CollegeNotFoundException  ex){
            System.out.println(ex.getMessage());
        }


    }

}
