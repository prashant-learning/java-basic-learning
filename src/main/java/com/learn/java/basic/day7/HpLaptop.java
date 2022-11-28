package com.learn.java.basic.day7;

public abstract class HpLaptop implements Computer{

    @Override
    public int getRamSize(){

        System.out.println(Computer.hardwareOperatingType);

       // Computer.hardwareOperatingType = "abc";
        return 16;
    }

    public String getMyCompanyName(){
        return "OLD HP LAPTOP";
    }

}
