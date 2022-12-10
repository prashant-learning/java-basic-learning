package com.learn.java.basic.day15;

/**
 *
 *    Wrapper class -> Important in your Interprise application
 *
 *
 *
 *    int         double      float    boolean     long     char
 *
 *    Integer     Double      Float    Boolean     Long    Character
 *
 *
 *
 *
 */





public class Program15_1 {

    public static void main(String[] args) {


        // int primitive type
        int age = 10;


        // Wrapper of int
        Integer age_wrapper = new Integer(10);



        // Boxing and unboxing


        // Unboxing
       int abc =  age_wrapper.intValue();
        System.out.println(abc);


        // Boxing
        int marks = 90;

        Integer marks_wrapper = Integer.valueOf(marks);

        System.out.println(marks_wrapper);



        boolean isAdult = true;

        Boolean isAdult_wrapper = Boolean.valueOf(true);

        boolean wrapper_to_boolean_primitive = isAdult_wrapper.booleanValue();




        float price = 45.45f;

        Float price_wrapper = Float.valueOf(price);

        float wrapper_primitive_float = price_wrapper.floatValue();


    }
}
