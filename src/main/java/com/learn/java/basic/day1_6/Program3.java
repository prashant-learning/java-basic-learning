package com.learn.java.basic.day1_6;

/**
 * Print all number of array in backward or reverse order using while loop
 * Print all number from oddNumArray in both forward and backward iteration using for loop and while loop
 * Search a num from array if its present, print its location else if it's not found print number doesn't exist
 */

public class Program3 {

    public static void main(String[] args) {

        /**
         * Array will always start indexing from 0
         *
         * So if we tell array size is 5 that means we are have values from index 0 to 4
         */

        //0 to 6
        int[] evenNumberArray = {2,4,6,8,10,12,14};

        //evenNumberArray[6] = -1;
       // evenNumberArray[4] = -10;
      //  evenNumberArray[0] = -30;

       // System.out.println( evenNumberArray.length);

      //  System.out.println(evenNumberArray[6]);


        /**
         * forward iterating of array
         */
        for(int i = 0; i < evenNumberArray.length; i++){
            System.out.println(evenNumberArray[i]);
        }

        System.out.println("********************************************************");
        /**
         * backward or reverse iteration of array
         */

        for(int i = evenNumberArray.length -1; i>=0; i--){

            System.out.println(evenNumberArray[i]);
        }


        System.out.println("*************************while iteration of array forward iteration*******************************");
        /**
         * while iteration of array forward iteration
         */
       // [2,4,6,8,10,12,14]
        int j = 0;

        while(j < evenNumberArray.length){
            System.out.println(evenNumberArray[j]);
            j++;
        }

        System.out.println("*************************throw exception as we are trying to access the array element more than its size*******************************");



        /**
         * throw exception as we are trying to access the array element more than its size
         */
       // System.out.println(evenNumberArray[7]);


        System.out.println("*************************Another way of array initialization*******************************");


        int[] oddNumArray = new int[5]; // creating  or initializing an empty array of size 5 which is from 0 to 4 index

       // System.out.println(oddNumArray[4]);

        oddNumArray[0] = 1;
        oddNumArray[1] = 3;
        oddNumArray[4] = 9;

       // System.out.println(oddNumArray[4]);

        for(int i = 0; i < oddNumArray.length; i++){
            System.out.println(oddNumArray[i]);
        }

        System.out.println("*************************Search a number from an array and print its index*******************************");

        /**
         *
         * Search a number from an array and print its index
         *
         */

        int[] bigArray = {3,45,254,564,12,654,676,234,68,23,8,765,123,5,797,23,6676,2353,6687,457,344,5,67,23,65,77};

        int findNumber = 5;

        System.out.println(bigArray.length);

        for(int i = 0; i < bigArray.length; i++){

            if(findNumber == bigArray[i]){

                System.out.println("We found the number " + findNumber + " at location " + i);
                //break;
            }
        }

        System.out.println("*************************Solve this problem*************************************");


        //variable count = 0

        for(int i = 0; i < bigArray.length; i++){

            if(findNumber == bigArray[i]){
                //increment the counter
                // System.out.println("We found the number " + findNumber + " at location " + i);
                break;
            }
        }

        //check if the counter is having values > 0 then found location (i)  else number not present





    }
}
