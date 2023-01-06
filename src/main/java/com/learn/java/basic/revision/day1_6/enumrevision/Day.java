package com.learn.java.basic.revision.day1_6.enumrevision;
// Special class  -> variables , constructor and methods
public enum Day {

    MONDAY("weekday"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    TUESDAY("weekday"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    WEDNESDAY("weekday"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    THURSDAY("weekday"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    FRIDAY("weekday"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    SATURDAY("weekend"){
        @Override
        public String isHoliday() {
            return null;
        }
    },
    SUNDAY("weekend"){
        @Override
        public String isHoliday() {
            return null;
        }
    };


    private String dayType;

    private Day(String dayType){
        this.dayType = dayType;
    }

    public boolean isWeekend(){
       if( this.dayType.equalsIgnoreCase("weekday")){
           return false;
        } else{
           return true;
       }
    }

    public abstract String isHoliday();

}
