package com.Polymorphsim.Vehicle;

public class Truck extends Vehicle{
    @Override
    public void maxspeed(){
        System.out.println(super.getName()+"Truck has maxspeed of 120km/h");
    }
}
