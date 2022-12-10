package com.learn.java.basic.day15;


// Enhanced for loop or Enhanced iteration   =>>>>>>>>>> for Each
public class Program15 {

    public static void main(String[] args) {

        int inputArray[] = {1,2,3,4,5,6,7,8,9,0};


        // when we want control on which items needs to be skipped or taken
        for(int i =0; i < inputArray.length; ){
            System.out.println(inputArray[i]);

            i = i + 3;
        }


        // When we want to iterate all the items in the array
        for(int num : inputArray){
            System.out.println(num);
        }



    }
}
