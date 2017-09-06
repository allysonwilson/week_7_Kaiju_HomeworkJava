package com.example.kaiju_homework;

/**
 * Created by allysonwilson on 9/6/17.
 */

public abstract class Vehicle {
    public String type;
    public int healthValue;


    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {

        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

}




//    Give the army vehicles two methods of damaging the Kaiju.
//        (Give the vehicles attack methods).
//
//        Refactor the code so that the army vehicles implement an interface.
//        (Interface should define the vehicle attack methods).