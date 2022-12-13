package com.learn.java.basic.day17;

/**
 *   Constructor
 *
 *
 */
public enum Days {

    MONDAY("Weekdays"){
        @Override
        public  int getDayPosition(){
            return 1;
        }

        @Override
        public void printDayName() {
            System.out.println("MONDAY");
        }
    },
    TUESDAY("Weekdays"){
        @Override
        public int getDayPosition(){
            return 2;
        }

        @Override
        public void printDayName() {
            System.out.println("TUESDAY");
        }
    },
    WEDNESDAY("Weekdays"){
        @Override
        public int getDayPosition(){
            return 3;
        }

        @Override
        public void printDayName() {
            System.out.println("WEDNESDAY");
        }
    },
    THURSDAY("Weekdays"){
        @Override
        public int getDayPosition(){
            return 4;
        }

        @Override
        public void printDayName() {
            System.out.println("THURSDAY");
        }
    },
    FRIDAY("Weekdays"){
        @Override
        public int getDayPosition(){
            return 5;
        }

        @Override
        public void printDayName() {
            System.out.println("FRIDAY");
        }
    },
    SATURDAY("Weekend"){
        @Override
        public int getDayPosition(){
            return 6;
        }

        @Override
        public void printDayName() {
            System.out.println("SATURDAY");
        }
    },
    SUNDAY("Weekend"){
        @Override
        public int getDayPosition(){
            return 7;
        }

        @Override
        public void printDayName() {
            System.out.println("SUNDAY");
        }
    };

    private String dayType;

    private Days(String dayType){
        this.dayType = dayType;
    }

    public String getDayType(){
        return dayType;
    }

    public abstract int getDayPosition();

    public abstract void printDayName();
}
