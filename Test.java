package com.Polymorphsim.Vehicle;

public class Test {
    public static void main(String[] args){
        Car c = new Car();
        c.setName("Honda city");
        c.maxspeed();

        Bike b = new Bike();
        b.setName("CD 70");
        b.maxspeed();

        Truck t= new Truck();
        t.setName("Hino");
        t.maxspeed();
    }

}
