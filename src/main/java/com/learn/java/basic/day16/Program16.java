package com.learn.java.basic.day16;


import static com.learn.java.basic.day16.Employee.classType;
import static com.learn.java.basic.day16.Employee.printClassType;

/**
 *   Access Modifier
 *
 *   we can apply the access modifier to the below in java
 *   1. class
 *   2. variable
 *   3. constructor   -> private constructor to create Singleton class
 *   4. method        -> private methods , we should create when that particular is only being used from same class
 *
 *
 *   Kind of access modifier
 *   1. default  -> within the same package. if you dont mentioned then it will by default provided compiler
 *   2. public   -> it accessible publicly. No matter where the thing is defined
 *   3. private  -> Its accessible only within the class
 *   4. protected -> within the package and out the package through the child class
 *
 *
 *    a. package   it specifies where exactly the class is present
 *    b. import    it helps to import a class or static variable or static method
 *
 *
 *
 *    Create API means -> create public method
 *
 */


public class Program16 {

    public static void main(String[] args) {

        System.out.println(classType);
        printClassType();

        Employee emp = new Employee();

        //emp.empName;
        System.out.println(emp.calculateEmployeePF());
    }
}
