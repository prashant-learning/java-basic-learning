package com.learn.java.basic.day1;

import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 *  Find the smallest number from the array of integer
 *
 * array = [5,3,5,2,5,43,7,77,99,101,9,45,50]   number  = 5   answer should be 3
 *                                              number  = 101   answer should be 1
 *                                              number = 200  answer should be 0
 *
 *      how many times this number is present in the array
 *      calculate the sum of all the odd number
 *
 *      calculate the sum of all the number which are less than the given number
 *      [5,3,5,2,5,43,7,77,99,101,9,45,50] and number = 77
 *
 *
 */
public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] inputArray = new int[10];

//        for(int i = 0; i < 10; i++){
//
//            System.out.println("enter next number");
//            inputArray[i] = sc.nextInt();
//        }
//
//        for (int j = 0; j < 10; j++){
//            System.out.println(inputArray[j]);
//        }


        // {1,2,3,4,5,6}  = 1*2*3*4*5*6

        int[] arrayMul = {1,2,3,4,5,6,7};

        int mulTotal = 1;
        int sumTotal = 0;

        for (int i=0; i < arrayMul.length; i++){

            mulTotal = mulTotal * arrayMul[i];
            sumTotal = sumTotal + arrayMul[i];
        }

        System.out.println(mulTotal);
        System.out.println(sumTotal);

        /**
         *
         *   Find the largest number in an array
         *
         *   [5,3,5,2,5,43,7,77,99,101,9,45,50]
         *
         *   largest = -1;
         *
         *   iterate the array ( for loop)
         *
         *   if(largest < current value array )
         *     largest = current values
         *
         *   after your for loop  we will print the largest number
         *
         */



        // Array which contains negative number  and positive number

        int[] searchLargestNumberArray = {-5,-3,-5,-2,-5,-43,-7,-77,-99,-101,-9,-45,-50};  // only positive number


        int largest = Integer.MIN_VALUE;;

        for (int i = 0; i < searchLargestNumberArray.length; i++){

            if(largest < searchLargestNumberArray[i]){
                largest = searchLargestNumberArray[i];
            }
        }

        System.out.println(largest);


        String[] strArray = new String[5];

        strArray[0] = "ABC";
        strArray[1] = "XYZ";
        strArray[2] = "%%%%";

        char[] charArray = new char[5];

        charArray[0] = 'A';
        charArray[1] = 'B';
        charArray[2] = 'C';
        charArray[3] = 'D';


        System.out.println(Integer.MAX_VALUE);

        long a = 2147483648L;
        System.out.println(a);

        System.out.println(Long.MAX_VALUE);







    }
}
