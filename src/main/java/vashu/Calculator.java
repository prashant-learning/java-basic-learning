package vashu;


// Taking input from user  ( scanner class)
// switch case
// method


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter next operation +  -  *  /  %");

        char[] validOperations = {'+', '-', '*', '/', '%'};

        String operation = scanner.next();

        if(checkIfCharPresentInGivenArray(operation.charAt(0), validOperations)){

            System.out.println("User have given a valid operation");

        } else {
            System.out.println("User have entered a invalid option to perform");
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
}
