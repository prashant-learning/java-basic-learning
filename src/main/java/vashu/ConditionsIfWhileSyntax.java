package vashu;

import java.util.Scanner;

public class ConditionsIfWhileSyntax {

    public static void main(String[] args) {


        if(true){

            System.out.println("i will always execute");
        }


        if(false){

            System.out.println("i will not get execute");
        }

        if(checkReturnIf()){

            System.out.println("I am inside the if block");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the operation you want to perform");

        while (true){

            String operation = scanner.next();

            System.out.println("user input is : " + operation);

            if(operation.equals("stop")){
                break;
            }
        }
    }


    public static boolean checkReturnIf(){
        return  false;
    }
}
