package com.example.kaiju_homework;

/**
 * Created by allysonwilson on 9/6/17.
 */

public abstract class Kaiju {
  public String name;
    int healthValue;
    int attackValue;



    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

//    public String roar();

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }


}
