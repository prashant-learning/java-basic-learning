package vashu;


// Taking input from user  ( scanner class)
// switch case
// method


/**
 *
 * Implement the remaining operations
 *
 *
 */


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter next operation +  -  *  /  %");

            char[] validOperations = {'+', '-', '*', '/', '%'};

            String operation = scanner.next();

            if(operation.equals("stop")){
                break;
            }

            int firstNum, secondNum;

            char operationTOBePerformed = operation.charAt(0);

            if (checkIfCharPresentInGivenArray(operationTOBePerformed, validOperations)) {

                System.out.println("User have given a valid operation");

                switch (operationTOBePerformed) {
                    case '+':
                        System.out.println("Enter first number");
                        firstNum = scanner.nextInt();
                        System.out.println("Enter 2nd number");
                        secondNum = scanner.nextInt();
                        int sum = add(firstNum, secondNum);
                        System.out.println("sum of 2 number is " + sum);
                        break;
                    default:
                        System.out.println("Enter first number");
                        firstNum = scanner.nextInt();
                        System.out.println("Enter 2nd number");
                        secondNum = scanner.nextInt();
                        int rem = remd(firstNum, secondNum);
                        System.out.println(" Reminder of 2 number is " + rem);

                }


            } else {
                System.out.println("User have entered a invalid option to perform");
            }
        }
    }


    /**
     * Check if char is present in the array return true or else return false
     */

    public static boolean checkIfCharPresentInGivenArray(char ch, char[] validOperationArray){

        for(int i =0; i < validOperationArray.length;  i++){

            if(validOperationArray[i] == ch){
                return true;
            }
        }
        return false;
    }

    public static int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int remd(int firstNum, int secondNum){
        return firstNum % secondNum;
    }
}
