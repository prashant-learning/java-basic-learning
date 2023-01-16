package com.learn.java.basic.day33;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// LocalDate  => sql date without time, LocalDateTime => date with time , LocalTime
public class Program33_1 {

    public static void main(String[] args) {


//        LocalDate todayDate = LocalDate.now();
//        System.out.println(todayDate);

//        Date date = new Date(new java.util.Date().getTime());
//        System.out.println(date);







        LocalDate localDate = LocalDate.now();

      //  System.out.println(localDate);




       // System.out.println(todaysDate);


        // Today date  -10   and    today + 10

        LocalDate currentDate = LocalDate.now();
        LocalDate previousDate = currentDate.minusDays(10);
        System.out.println(previousDate);
        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println(futureDate);


        System.out.println("**************************");

        String todaysDate = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("PST"))).format(DateTimeFormatter.ofPattern("yyyy-MMM-dd"));

        System.out.println(todaysDate);  // 2023-May-23
        LocalDate todatsLocalDate = LocalDate.parse(todaysDate, DateTimeFormatter.ofPattern("yyyy-MMM-dd"));

        System.out.println(todatsLocalDate);

        System.out.println("*****************************");

        Instant instant = todatsLocalDate.atStartOfDay().atZone(ZoneId.of(ZoneId.SHORT_IDS.get("PST"))).toInstant();
        //System.out.println(dateWithTime);

        Date date1 = Date.from(instant);
        System.out.println(date1);


        LocalDate date2 = LocalDate.ofInstant(instant, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));

        System.out.println(date2);


        System.out.println(date2.plusYears(1).isLeapYear());
        System.out.println( date2.getDayOfWeek());

        System.out.println(isWeekend(date2));





    }

    public static boolean isWeekend(LocalDate date){
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);
    }

    public static boolean isWeekDay(LocalDate localDate) {
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return (dayOfWeek != DayOfWeek.SATURDAY)
                && (dayOfWeek != DayOfWeek.SUNDAY);
    }


}
