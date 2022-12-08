package com.learn.java.basic.day13;

public class Program13 {

    public static void main(String[] args) {

        try {

            int[] arrayInput  = {1,2,3,4,5};

            int a = 190 / 0;  // Arithmetic Exception
            System.out.println(arrayInput[10]);  // ArrayOutOfBoundException

        } catch (Exception ex){

            if(ex instanceof ArithmeticException){
                System.out.println("I got Arithmetic Exception but still am recovering");
            } else if(ex instanceof ArrayIndexOutOfBoundsException){
                System.out.println("I got ArrayIndexOutOfBoundsException but still am recovering");
            }
            else{
                System.out.println("am not caught");
            }
        }

    }
}
