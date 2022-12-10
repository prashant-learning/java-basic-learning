package com.learn.java.basic.day14;

public class Student {

    public void getStudentAndCollegeGrade(String studentName, String collegeName) throws StudentNoFoundException, CollegeNotFoundException {

        College college = new College();

      //  try {
            int collegeGrade =  college.getCollegeGrade(collegeName);

            System.out.println(collegeGrade);
//        } catch (CollegeNotFoundException ex){
//
//            System.out.println(ex.getMessage());
//        }

        if(studentName.equals("Invalid")){

            throw new StudentNoFoundException();
        } else {
            System.out.println(studentName);
        }

    }
}
