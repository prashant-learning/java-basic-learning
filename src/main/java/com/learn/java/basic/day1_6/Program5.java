package com.learn.java.basic.day1_6;



/**
 *
 *     public/private/protected [Method return type] method Name (  n number of parameter with comma seperated  )  {
 *     }
 *
 *
 *     ClassName.main(ag[])
 *
 */


/**
 *
 *  Implement a calculator class where you should have add, substract, divide, multiply, percentage, remainder
 *
 *  6 method  and call all the method from main method
 *
 *
 *  Tomorrow : implement actual calculator
 *      using while and switch case
 *
 *      UserInput from console opertion + - / * % Per
 *                                      + 2 input return sum at console
 *
 *
 *     1. Create a method which will return boolean for a given number to the method is prime or not  (public boolean isNumberPrime(int num))
 *     2. Create a method which will take input as number and return boolean if number is odd or not  (public boolean  isNumberOdd(int number))
 *
 *
 *
 */

public class Program5 {

    public static void main(String[] args) {

        Program5 obj = new Program5();

        int sum = obj.add(20, 20);

        int sum3 = obj.add3Values(10,30,40);

        System.out.println(sum3);

       int totalStaticSum =  Program5.sum(2, 5);

        System.out.println(totalStaticSum);


        int[] userInputArray = {1,2,3,4,56,6,7,6,5,4,6,8,35};

        int sumOfArrayItems =  obj.sumOfArrayItems(userInputArray);

        System.out.println(sumOfArrayItems);
    }


    public int add(int firstInput, int secondInput){
        int sum = firstInput + secondInput;
        return sum;
    }

    public int add3Values(int firstInput, int secondInput, int thirdInput){
        int sum = firstInput + secondInput + thirdInput;
        return sum;
    }


    // static magic    -> keyword  -> class level instantiation

    public static int sum(int a, int b){
        return a + b ;
    }


    // method should take array as input and return the sum of all number in an array
    /**
     *
     *    [1,2,3,4,56,6,7,6,5,4,6,8,35]  -> input to method  -> pass to method as parameter
     *
     */


    public int sumOfArrayItems(int[] inputArray){

        int sum  = 0;

        for (int i = 0; i < inputArray.length; i++){
            sum = sum + inputArray[i];
        }
        return sum;
    }




}
