package com.learn.java.basic.day11.bankexample;

public class ProgramBank {

    public static void main(String[] args) {

        Rbi bank = null;

        bank = new Sbi();

        System.out.println(bank.getRateOfInterest());

        bank = new Hdfc();

        System.out.println(bank.getRateOfInterest());

        bank =  new Axis();

        System.out.println(bank.getRateOfInterest());





    }
}
