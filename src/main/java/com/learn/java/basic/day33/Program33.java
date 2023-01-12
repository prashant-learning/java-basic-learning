package com.learn.java.basic.day33;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program33 {

    public static void main(String[] args) throws ParseException {

        Date currentDate = new Date();

        System.out.println(currentDate);


        long currentMilliSec = System.currentTimeMillis();

        System.out.println(currentMilliSec);


        // create a specific currentDate, we can get the milli second pass to currentDate class

        Date dateOfBirthDate = new Date(631166858000L);
        System.out.println(dateOfBirthDate);

        // Mon Jan 01 09:37:38 IST 1990   1990 Jan 09

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMM/dd");

        String format = simpleDateFormat.format(dateOfBirthDate);

        System.out.println(format);

        Date parsedDate = simpleDateFormat.parse(format);

        System.out.println(parsedDate);

        // cuurentDate  , dateOfBirthDate


        // after,  before  -> it compare the 2 date and find if date is before or after a date
        boolean before = dateOfBirthDate.after(currentDate);
        System.out.println(before);

        Instant dobInstant = dateOfBirthDate.toInstant();
        System.out.println(dobInstant);

        Date from = Date.from(dobInstant);
        System.out.println(from);

        System.out.println();
        Date dateOfBirthDateNew = new Date(dateOfBirthDate.getTime());
        System.out.println(dateOfBirthDateNew);


    }

}
