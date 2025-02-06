package com.Polymorphsim.Vehicle;

public class Bike extends Vehicle{
    @Override
    public void maxspeed(){
        System.out.println(super.getName()+"Bike has maxSpeed of 100km/h");
    }
}
