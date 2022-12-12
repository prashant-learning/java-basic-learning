package com.learn.java.basic.day14;


import com.learn.java.basic.day14.exception.CollegeNotFoundException;

public class College {

    /**
     *
     *     Trying to call DB and check if college name is present in DB or not
     *
     *     Now if its not present it will throw error
     *
     *
     * @return
     */
    public int getCollegeGrade(String name) throws CollegeNotFoundException {

        if(name.equals("Invalid")){
            throw new CollegeNotFoundException();
        } else{
            return 10;
        }
    }
}
