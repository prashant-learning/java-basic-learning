package com.learn.java.basic.day1_6;


/**
 * Looping
 *  1. for loop
 *  2. while loop
 *  3. do while loop
 *  4. switch case
 *
 *
 *
 * Print to check if a number is prime number
 * Print sum of all odd number from 1 to 50  int sum  sum = sum + i
 * Print all even number from 99 to 10 in reverse order   (int = 0; i < 10 ; i ++ )  (int i = 99 ; i > 10 ; i--)
 *
 *
 * Implement a problem where we need to pass char as input and check if that char is same and print the state name
 * h -> hyderabad  d -> delhi, c -> chennai , m  -> mumbai default -> state doesn't exist
 *
 *
 */
public class Program2 {

    public static void main(String[] args) {

        int a ;
        // print number from 1 to 10
        for( a = 1; a <= 10; a++ ){

            System.out.println(a);
        }
        System.out.println(a);


        for(int i = 1; i <= 10; ){

          //  System.out.println(i);
            i = i + 2;
        }

        //  print all even number from 1 to 50

        int count = 0;

        for(int i = 0; i <=50; i++) {
            if(i % 2 == 0){
                count = count + 1;
               // System.out.println(i);
                if(count > 10){
                    break;
                }
            }

        }
       // System.out.println(count);


        // While loop
        int i = 1;
        while( i <= 10){
           // System.out.println(i);
            i = i + 1;
        }

        // do while

        int j = 1;

        do{
          //  System.out.println(j);
            j++;
        }while(j <= 10);


        // switch case

        int age = 10;
        char genderType = 'm';

        switch (age){
            case 10 :
                System.out.println("Am a youth");
                switch (genderType){
                    case 'f':
                        System.out.println("am a female");
                        break;
                    case 'm':
                        System.out.println("am a male");
                        break;
                    default:
                        System.out.println("don't want to mentioned");
                }
                break;
            case 20:
                System.out.println("am adult");
                switch (genderType){
                    case 'f':
                        System.out.println("am a female");
                        break;
                    case 'm':
                        System.out.println("am a male");
                        break;
                    default:
                        System.out.println("don't want to mentioned");
                }
                break;
            case 65:
                System.out.println("am senior citizen");
                switch (genderType){
                    case 'f':
                        System.out.println("am a female");
                        break;
                    case 'm':
                        System.out.println("am a male");
                        break;
                    default:
                        System.out.println("don't want to mentioned");
                }
                break;
            default:
                System.out.println("am way older than others");
                switch (genderType){
                    case 'f':
                        System.out.println("am a female");
                        break;
                    case 'm':
                        System.out.println("am a male");
                        break;
                    default:
                        System.out.println("don't want to mentioned");
                }

        }


        // continue keyword

        // iterate from 1 to 10, if it's even number than don't multiply number with 5
        for(int k = 1; k <= 10; k++ ){

            if(k % 2 == 0){
                continue;
            }
            System.out.println(k * 5);

        }












    }
}
