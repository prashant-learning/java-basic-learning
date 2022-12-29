package com.learn.java.basic.day26;

public class Program26_1 {

    public static void main(String[] args) {

        PrintingThread t1 = new PrintingThread();

        t1.start();

        System.out.println("Did we executed this part");

        printDifferentString();
    }


    public static void printDifferentString(){

        for (int i =0; i<1000000;i++){
            System.out.println("@@@@@@@@@@@@@@@@@@");
        }

    }
}
