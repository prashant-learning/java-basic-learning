package com.learn.java.basic.day10;

public class Children extends Father {

    public int getBankAccountDetails(){
        return 0;
    }

    public int giveAge(){

        int fatherAge = super.age;

        int myAge = fatherAge - 30;

        if(myAge > 18){
           int accountDetails = super.getBankAccountDetails();

            //System.out.println(accountDetails);
        }

        return myAge;
    }

    public int getGrandParentAccountDetails(){
       return super.getParentAccountDetails();
    }

}
