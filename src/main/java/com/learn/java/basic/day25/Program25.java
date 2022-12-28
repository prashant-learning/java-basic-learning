package com.learn.java.basic.day25;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 *     1. Comparator    -> multiple sorting technique  , no changes required in original class
 *     2. Comparable   -> single sorting technique (default ) , make changes in original class
 *
 *
 *
 *     Task : Create a flight class with
 *     passengerCapacity, fuelCapacity, time  , name, number, source, destination, arrivalTime, departureTime
 *
 *     Task : Create a single sorting (comparable with fuelCapacity)
 *     Task : Create multiple sorting technique with all variables  9 comparator
 *
 *
 *
 *
 *
 */


public class Program25 {

    public static void main(String[] args) {


        List<Flight> flightList = new ArrayList<>(); // yes to all

        flightList.add(new Flight("Indigo", 544, "hyd", "mum"));
        flightList.add(new Flight("AirIndia", 999, "mum", "jammu"));
        flightList.add(new Flight("Etihad", 101, "goa", "kolkata"));  // yes to all


       // Collections.sort(flightList);

      //  Collections.reverse(flightList);

        for (Flight temp : flightList){
            System.out.println(temp);
        }

        List<Flight> flightListWithName = new ArrayList<>();

        flightListWithName.addAll(flightList);


        Collections.sort(flightListWithName, new NameComparator());

       Collections.sort(flightListWithName, new Comparator<Flight>() {
           @Override
           public int compare(Flight o1, Flight o2) {
               return 0;
           }
       });


        for (Flight temp : flightListWithName){
            System.out.println(temp);
        }

    }
}
