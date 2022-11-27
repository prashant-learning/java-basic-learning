package com.learn.java.basic.day1_6;

public class Program6 {

    public static void main(String[] args) {


        // for loop

        for (int i = 0; i <= 50; i++){

            if(i % 2 == 0) {
               // System.out.println(i);
            }
        }


        // while loop
        int a = 0;

        while (a <= 50){

            if(a % 2 == 0) {
               // System.out.println(a);
            }

            a++;
        }


        // do while loop

        int b = 100;

        do{
            if(b % 2 == 0) {
               // System.out.println(b);
            }
            b++;
        } while(b <=50);


        // dataType[] arrayName = new dataType[5]
        // dataType[] arrayName = {1,2,3,5,7,8,0,3}

        int[] rollNumberArray = new int[5];  // valid index 0 to 4     [ 0,0,0,0,0 ]    arrayName[3]


        rollNumberArray[3] = 7;
        rollNumberArray[4] = 13;

       // rollNumberArray[5] = 100;


//        System.out.println(rollNumberArray[0]);
//        System.out.println(rollNumberArray[1]);
//        System.out.println(rollNumberArray[2]);
//        System.out.println(rollNumberArray[3]);
//        System.out.println(rollNumberArray[4]);
      //  System.out.println(rollNumberArray[5]);


        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};

//        System.out.println(inputArray.length);
//
//        System.out.println(inputArray[5]);


        // print all the item in the array

        for (int i = 0 ; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }

        int x = 0;

        while(x < inputArray.length){

            System.out.println(inputArray[x]);
            x++;
        }


        // Switch case

        int age = 50;

        switch (age){
            case 40 :
                System.out.println("My age is 40");
                break;
            case 50:
                System.out.println("My age is 50");
                break;
            case 60:
                System.out.println("my age is 60");
                break;
            default:
                System.out.println("am a kid");
        }


        Program6 objectOfProgram6 = new Program6();

        int funReturnValue =  objectOfProgram6.addTwoNumber(10, 20);

        System.out.println(funReturnValue);



    }


    // Takes 2 number as input parameter and return the sum of both the number
    // all data type along with void (don't need to return anything)

    public int addTwoNumber(int a, int b){

        int sum = a + b;

        return  sum;
    }


    public double addTwoRandomNumber(){

        double a = Math.random();

        double b = Math.random();

        return  a + b;

    }


    public void printRandomNumber(int a, String abc, double xyz, float rty, char ch){
        System.out.println(Math.random());
    }
}
