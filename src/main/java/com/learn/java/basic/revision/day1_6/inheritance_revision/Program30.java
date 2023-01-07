package com.learn.java.basic.revision.day1_6.inheritance_revision;

/**
 *     Class ------ Interface
 *
 *     ChildClass extends ParentClass
 *
 *     ChildClass implement ParenInterface
 *
 *     ChildInterface extends ParentInterface
 *
 *
 *     Type of interface :
 *
 *     Single Level Inheritance
 *
 *     multi level Inheritance
 *
 *     Multiple Inheritance
 *
 *
 *
 *    A extends B C D
 *
 *    D
 *
 *    C extends D   -> Single level
 *
 *    B extends C   -> Single level    -> Multi level
 *
 *    A extends B   -> Single level
 *
 *       D
 *
 *    B extends A
 *
 *    C extends A     -> Hierachichal
 *
 *    D extends A
 *
 *
 *
 *
 *
 *
 *
 *
 *     Teacher
 *
 *     Student extends Teacher
 *     Libarian extends Teacher
 *     ClassTeacher exentds Teacher
 *     Principal extends Teacher
 *
 */



public class Program30 {

    public static void main(String[] args) {

        Parent parent = new Parent();

        System.out.println(parent.getAccountDetails());

        GrandParent grandParent = new GrandParent();

        System.out.println(grandParent.getAccountDetails());


        Parent parent1 = new Parent();

        System.out.println(parent1.getAccountDetails());

        System.out.println(parent1.getDna());



        Son son = new Son();

        System.out.println(son.getAccountDetails());

        System.out.println(son.getDna());


        Daughter daughter = new Daughter();
        System.out.println(daughter.getAccountDetails());
        System.out.println(daughter.getDna());
    }
}
