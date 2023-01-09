package com.learn.java.basic.revision.day1_6.super_revision;

/**
 *   super, this and final keyword
 *
 *    this -> current object
 *
 *    super -> is a keyword used to access its immediate parent   ( variable, method or constructor )
 *
 *    final -> Its closed for change / we cannot update / we cannot extend
 *
 *
 */


public class Program31 {

    public static void main(String[] args) {

        Student  stu1 = new Student("ABC", "122342", "ABC");
        Student  stu2 = new Student("ABC", "122342", "ABC");

        System.out.println(stu1.getName());
        System.out.println(stu2.getName());

        stu1.setName("XYZ");

        System.out.println(stu1.getName());
        System.out.println(stu2.getName());


        Dog dog = new Dog();
        dog.printAnimalType();

    }
}
