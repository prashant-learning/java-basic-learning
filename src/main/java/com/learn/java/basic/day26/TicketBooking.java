package com.learn.java.basic.day26;

public class TicketBooking extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Get the Passenger details");
        System.out.println("Get the travel plan");
        System.out.println("Get Booking date");

        for (int i =0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("check In DB if tickets are available");
        System.out.println("book the ticket");


    }
}
