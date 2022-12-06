package com.learn.java.basic.day12.exception;

public class Program13CustomException {

    public static void main(String[] args) {

        int i = 10;
//        try {
//            int result = 2 / 0;
//
//        } catch (ArithmeticException ex){
//
//            throw new VashuException();
//        }

        try {
            if (i == 10) {
                throw new VashuException("Hey am getting value");
            }
        } catch (VashuException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
