package com.learn.java.basic.day12.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *   Need to read a file and catch the exception    compile time
 *
 *
 */
public class Program13 {

    public static void main(String[] args) {
        Scanner myReader =  null;
        try {
            File file = new File("E:\\work\\spring-learning\\non-reactive\\java-basic-learning\\conceptCovered1.txt");

            myReader  = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex){

            System.out.println("Yeah i got the exception");

            try {
                File file = new File("E:\\work\\spring-learning\\non-reactive\\java-basic-learning\\conceptCovered.txt");

                myReader  = new Scanner(file);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException ex1){
                System.out.println("we agian go an exception");
            }


        }finally {
            System.out.println("we will always execute ");
        }


    }
}
