package com.learn.java.basic.day7;


/**
 * ctrl + click -> will go to interface method
 *
 * ctrl +alt +click will show all the available implementation
 *
 * Object of interface and abstract class cannot be created
 *
 */
public class Program7 {

    public static void main(String[] args) {

        Computer hpLaptopObject = new HpNewLaptop();

        int hpLaptopRamSize = hpLaptopObject.getRamSize();
        int hpLaptopHardDiskSize = hpLaptopObject.getHDDSize();

        System.out.println(hpLaptopRamSize);
        System.out.println(hpLaptopHardDiskSize);


        Computer acerLaptop = new AcerLaptop();

        int acerLaptopRamSize = acerLaptop.getRamSize();

        System.out.println(acerLaptopRamSize);

    }

}


