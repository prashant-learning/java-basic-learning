package com.learn.java.basic.revision.day1_6.super_revision;

public class HpLaptop extends Computer{

    private String screenSize;

    public HpLaptop(String screenSize, int ram, int cpuCore, String speed) {
        super(ram, cpuCore, speed);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
