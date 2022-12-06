package com.learn.java.basic.day12.exception;


import java.io.File;
import java.io.IOException;

/**
 * Exception handling
 * -> try {
 * <p>
 * any code which could lead to an exception
 * <p>
 * } catch(){
 * <p>
 * } catch(){
 * <p>
 * } finally {
 * <p>
 * }
 *
 *
 *
 *   catch should be in order of child to parent
 *
 *
 *   ArithmeticException > RuntimeException >  Exception  > Throwable > Serializable
 *
 *
 * Runtime exception are not checked exception
 *
 * But a normal or compile time exception means an exception that directly extending Exception is an checked Exception
 *
 *
 *
 *
 * try{
 *
 *
 * } catch(ArithementException ex ){
 *
 * } catch(Exception ex){
 *
 * } finally{
 *
 *
 * }
 *
 *
 *
 * RuntimeException  -> classs
 *
 *
 * if any exception
 *
 *
 *
 *
 *
 * VashuException  extends RuntimeException   -> unchecked exception    -> compiler cannot find at compile time  -> it will be at runtime
 *
 * MouliException  extends Exception          => checked exception   -> compiler will be able to identify if the code inside  try block is throwing
 *                                                                     that mouliExpection or not else it will say this exception is not thrown from code
 * 																	inside try block
 *
 *    1. How to write try catch in java
 *    2. Divide the number and catch Arithmetic exception
 *    3. Print the code in finally to show its always running if exception occurred  runTime
 *    4. Need to read a file and catch the exception    compile time
 *    5. Create a array of size 5 and try to set value for index 10 and then catch the exception ArrayIndexOutOfBoundsException
 *
 *
 *   6. Create a custom compile time and runtime exception
 *
 */


public class Program12Exception {

    public static void main(String[] args) {

        try {
            int i = 0;

            int j = 19;

            int k = 34;

            int l = j * k;

            int m = i + j * l;

            System.out.println(m);

           // File file = new File("");
           // file.getCanonicalPath();

           // System.out.println(j / i);  // 19 / 0 ->  Arithmetic exception

        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex){

        }
//        catch (IOException ex){
//
//        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Here is the finally ");
        }

    }
}
