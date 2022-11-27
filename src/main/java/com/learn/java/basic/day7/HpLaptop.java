package com.learn.java.basic.day7;

public class HpLaptop implements Computer{

    @Override
    public int getRamSize(){

        System.out.println(Computer.hardwareOperatingType);

       // Computer.hardwareOperatingType = "abc";
        return 16;
    }


    @Override
    public int getHDDSize(){
        return 500;
    }
}
