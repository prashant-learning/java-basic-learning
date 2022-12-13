package com.learn.java.basic.day17;

/**
 *  Special class which hold a group of constant (final , unchangable )
 *
 *  public class ClassName{
 *
 *  }
 *
 *  public enum EnumName{
 *
 *  }
 *
 *
 *
 *  Advanced topic is ENUM
 *
 *  Constructor
 *  Variable
 *  Method
 *
 *
 *
 */


/**
 *   for each   ->  is to iterate each item in the array
 *
 *
 *
 *   Create Country ENUM which will have a constructor India("RUPEE", "DELHI", "NARENDAR MODI")
 *
 *  3 abstract method
 *   1. getCurrency
 *   2. getCapital
 *   3. getPmName
 *
 *
 *
 *    Create a Level EMUM and print the values of enum using for-loop and for each loop
 *
 *
 */

public class Program17 {

    public static void main(String[] args) {

        //System.out.println(Days.valueOf("MONDAY"));

        Days day1 = Days.TUESDAY;

        Days[] days =  Days.values();

       for (int i = 0; i < days.length; i++){
           System.out.print(days[i]);
           switch (days[i]){
               case MONDAY:
               case TUESDAY:
               case WEDNESDAY:
               case THURSDAY:
               case FRIDAY:
                   System.out.println(" ----->    Weekday");
                   break;
               case SATURDAY:
               case SUNDAY:
                   System.out.println(" ----->    Weekend");
                   break;
           }
       }


       // Implement with for each

        // syntactical sugar for loop
       for (Days temp : days){
           System.out.print(temp);
           switch (temp){
               case MONDAY:
               case TUESDAY:
               case WEDNESDAY:
               case THURSDAY:
               case FRIDAY:
                   System.out.println(" ----->    Weekday");
                   break;
               case SATURDAY:
               case SUNDAY:
                   System.out.println(" ----->    Weekend");
                   break;
           }
       }

        System.out.println(Days.FRIDAY != Days.MONDAY);

       if(Days.FRIDAY == Days.MONDAY){

       }

        System.out.println(Days.FRIDAY.getDayType());
        System.out.println(Days.SATURDAY.getDayType());

    }
}
