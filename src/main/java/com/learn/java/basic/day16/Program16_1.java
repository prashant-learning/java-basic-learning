package com.learn.java.basic.day16;

public class Program16_1 {

    public int getEmployeeSalary(String name){

        // need to call DB
        makeDBConnection();

        // need to validate user
        validateUser(name);

        // calculate the PF
        calcualtePF();

        // calculate the salary

        return 123123123;
    }


    private void makeDBConnection(){

    }

    private boolean validateUser(String nameUser){
        return false;
    }

    private double calcualtePF(){
        return 324324.23d;
    }
}
