package com.learn.java.basic.day25;

// passengerCapacity, fuelCapacity, time

public class Flight implements Comparable<Flight>{  // clear to all

    private String name;
    private int number;
    private String src;
    private String dest;

    public Flight(String name, int number, String src, String dest) {
        this.name = name;
        this.number = number;
        this.src = src;
        this.dest = dest;
    }

    // positive, negative  and zero
    @Override
    public int compareTo(Flight o) {
        if(o.number < number){
            return 1;
        } if(o.number > number){
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
