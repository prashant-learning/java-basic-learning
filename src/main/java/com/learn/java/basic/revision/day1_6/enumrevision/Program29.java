package com.learn.java.basic.revision.day1_6.enumrevision;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Program29 {

    public static void main(String[] args) {

//        System.out.println(Day.MONDAY);
//        System.out.println(Day.THURSDAY);

        Day[] values = Day.values();

        for (int i =0; i < values.length; i++){
            System.out.println(values[i]);
        }

        System.out.println(Day.valueOf("MONDAY"));

       // new Monday()

        System.out.println(Day.MONDAY.isWeekend());


       // Day day = Day.SATURDAY;

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        System.out.println(dayOfWeek);


        // LocalDate, LocalDateTime
        System.out.println(LocalDateTime.now());



        switch (dayOfWeek){
            case MONDAY:
                  // connect to server 1 and do clean up
            case TUESDAY:
                // connect to server 2 and do clean up
            case WEDNESDAY:
                // connect to server 3 and do clean up
            case THURSDAY:
            case FRIDAY:
                System.out.println("We have to go office and work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("We can enjoy and go out for party");
                break;
        }
    }
}
