package com.learn.java.basic.day12;

public class Program12 {

    public static void main(String[] args) {

        // We are not able to instantiate the object of abstract class
       // Animal animal = new Animal();  -> 'Animal' is abstract; cannot be instantiated

        Animal dog = new Dog();

        System.out.println(dog.sounds());


      //  Flight flight =  new Flight();  -> 'Flight' is abstract; cannot be instantiated

        Flight airbus320 = new Airbus320();

        System.out.println(airbus320.seatingCapacity());

    }
}
