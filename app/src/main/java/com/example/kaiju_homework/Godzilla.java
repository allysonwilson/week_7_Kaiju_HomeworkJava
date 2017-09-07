package com.example.kaiju_homework;

/**
 * Created by allysonwilson on 9/6/17.
 */

public class Godzilla extends Kaiju{
        public Godzilla() {
        super("Godzilla", 100, 10);

    }

    public String move() { return ("Stomp, Stomp, Stomp")}
    public String roar() {
        return ("grumble grumble");
    }

    public void smash( attackValue)

}
    public void smash(Attack attackValue) { damage -= attack.getAttackValue(); }

//    public Trout() {
//        calories = 500;
//    }
//
//    public int getCalories() {
//        return calories;
//    }
//}