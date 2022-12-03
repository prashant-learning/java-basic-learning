package com.learn.java.basic.day11;

public class Program11 {

    public static void main(String[] args) {


        // compile time -> we are able indentify which method will get called

        Polygon obj = new Rectangle();

        obj.printShape();
       // obj.printShape(2, 4);



    }



}
