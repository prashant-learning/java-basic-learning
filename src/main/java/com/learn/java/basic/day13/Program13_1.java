package com.learn.java.basic.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program13_1 {

    public static void main(String[] args) {

        try {

            int[] arrayInput  = {1,2,3,4,5};
            System.out.println(arrayInput[10]);  // ArrayOutOfBoundException
            int a = 190 / 0;  // Arithmetic Exception

            String abc = null;

            System.out.println(abc.length());

            // DB connection

            // executing statement into db i got error
            File file = new File("E:\\work\\spring-learning\\non-reactive\\java-basic-learning\\conceptCovered1.txt");

           Scanner myReader  = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("I got ArrayIndexOutOfBoundsException but still am recovering");
        } catch (ArithmeticException ex){
            System.out.println("I got Arithmetic Exception but still am recovering");
        } catch (FileNotFoundException ex){

        }
        catch (NullPointerException ex){
            System.out.println("I got NullPointerException  but still am recovering");
        }
        catch (Exception ex){
            System.out.println("AM the parent exception if any of the above catch didn't caught the exception i will handle");
        } finally {
            // db.close
        }

    }
}
