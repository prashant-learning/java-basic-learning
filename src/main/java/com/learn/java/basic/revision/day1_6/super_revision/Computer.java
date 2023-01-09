package com.learn.java.basic.revision.day1_6.super_revision;

public class Computer {

    private int ram;
    private int cpuCore;
    private String speed;

    public Computer(int ram, int cpuCore, String speed) {
        this.ram = ram;
        this.cpuCore = cpuCore;
        this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
