package com.example.kaiju_homework;

/**
 * Created by allysonwilson on 9/6/17.
 */

public abstract class Vehicle {
    public String type;
    public int healthvalue;
}

public Vehicle (String type, int healthValue){
    this.type = type;
    this.healthValue = healthValue;
}

  

    public String getType() {
        return type;
    }

    public int getHealthvalue() {
        return healthvalue;
    }


