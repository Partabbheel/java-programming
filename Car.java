package com.Polymorphsim.Vehicle;

public class Car extends Vehicle {
    @Override
    public void maxspeed(){
        System.out.println(super.getName()+"Car has max speed of 100km/h");
    }

}
