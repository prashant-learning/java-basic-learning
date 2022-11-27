package com.learn.java.basic.day1_6;

public class Program1 {

    // main method

    public static void main(String[] args) {


        /**
         *  Data types in java
         */

        int age = 10;
        double marks = 96.5d;
        long timeInSec = 124234234L;
        boolean isAdult = true;
        char alphabet = 'A';
        float percentage = 89.45f;
        String countryName = "India";


        /**
         *
         *  Arithmetic  Operators  + - * / %  ++ --
         *
         *  comparison Operator   == != > <  >=  <=
         *
         *  Assignment Operator  =
         *
         *  Logical Operator  && ||
         *
         */




        int marksMath = 89;
        int marksEnglish = 78;

        int totalScoredMarks = marksEnglish + marksMath;

        System.out.println(totalScoredMarks);

        int num1 = 19;

        System.out.println(num1 % 5);

        //  if age is less than 18, member is youth or else member is adult

        if(age < 18){
            System.out.println("member is Youth");
        } else {
            System.out.println("member is adult");
        }

        if(age == 10){
            System.out.println("member is kid");
        }

        if(age >= 5){
            System.out.println("kid can walk");
        }


        if(age > 18){

            System.out.println("am eligible to vote");
        } else if( age > 13 && age <= 18){
            System.out.println("am a youth member, not eligible for voting");
        } else if(age > 5 && age <= 13){
            System.out.println("i have started going to school");
        } else {
            System.out.println("I am kid and am playing");
        }


        if(age < 5 || age > 2){
            System.out.println("am going to play school");
        }

    }

}
