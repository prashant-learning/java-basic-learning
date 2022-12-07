package com.learn.java.basic.revision.day1_6;

public class Program1 {

    public static void main(String[] args) {

        // data types

        int age = 101;
        double marks = 99.45d;
        long timeStamp = 786666666l;
        float time = 45.45f;
        char ch = 'a';
        String name = "Ravi";
        boolean trueFalse = true;


        // if else   -> imp topic
        if(age == 10){
            System.out.println("yeah am ");
        } else if(marks == 99.45) {
            System.out.println("yeah marks is equal");
        } else if(time > 90){
            System.out.println("time is greater than 90");
        } else {

        }


        // Switch case
        int day = 0;  //  from your db

        switch (day){

            case 0 :
                System.out.println("This is sunday");
                break;
            case 1:
                System.out.println("This is monday");
               // break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is wednesday");
                break;
            default:
                System.out.println("Not matching");
        }


        //   Comparision Operator  10 == 5  > < >= <=  ! !=

        //  assignment operator     =

        //  logical operator     &&      ||

        // ternary operator



        boolean check = 1 >= 0;

        System.out.println(check);

        if(age == 101 && day == 1){
            System.out.println("Am executing only if both of them are true ");
        }

        if(age == 101 || day == 1){
            System.out.println("Am executing if any one of them are true ");
        }

        // if age > 18 then return "adult" else "minor"

        if(age > 18){
            System.out.println("adult");
        }else {
            System.out.println("minor");
        }

        String abc =  age > 18 ? "adult" : "minor";
        System.out.println(abc);



        // Looping
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");
        System.out.println("ravi");

        // iterate a loop from 0 to 9  -> 1 to 10

        for (int i = 0; i <= 9; i++){
            System.out.println("Raviteja");
        }

        int j =10;

        for (j = 5; j <15; ){
            System.out.println("Raviteja with different for loop syntax");
            j++;
        }

        // reverse for loop

        for(int i = 100; i > 0; i--){
            System.out.println(i);
        }

        // while loop

        int k = 0;
        while ( k < 10){
            System.out.println(k);
            k++;
        }

        // do while loop
        System.out.println("we are about to execute do while loop");

        int l =10;

        do{
            System.out.println(l);
            l--;
        }while (l >100);


        // infinite loop

//        while (true){
//            System.out.println("am creating an infinite loop  :(  :)");
//        }

        // array  -> data structure to store items which  are of same time in contiguious memory location
        // array is bounded data structure  -> while initilize we mention the size and it cannot be changed

        int[] myArray  = {1,2,3,4,5,6,7,8};  // index is = 0 to 7 but size = 8

        System.out.println(myArray[2]);
        myArray[2] = 10;
        System.out.println(myArray[2]);
        //

        System.out.println(myArray[7]);

      //  myArray[10] = 56;   storing or accessing in the index greater than the size - 1 will throw error

        int[] newSyntaxArray = new int[5];

        System.out.println(newSyntaxArray[0]);
        System.out.println(newSyntaxArray[1]);
        System.out.println(newSyntaxArray[2]);
        System.out.println(newSyntaxArray[3]);

        newSyntaxArray[0] = 8;
        newSyntaxArray[1] = 56;
        newSyntaxArray[2] = 34;
        newSyntaxArray[3] = 5677;
        newSyntaxArray[4] = 99999;

//        System.out.println(newSyntaxArray[0]);
//        System.out.println(newSyntaxArray[1]);
//        System.out.println(newSyntaxArray[2]);
//        System.out.println(newSyntaxArray[3]);

        for (int i =0 ; i < newSyntaxArray.length; i++){
            System.out.println(newSyntaxArray[i]);
        }


    }
}
