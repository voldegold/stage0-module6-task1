package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super();
    }

    @Override
    public String getDescription() {
        String color = "blue";
        int numberOfPaws = 2;
        boolean hasFur = false;

       return "This animal is mostly " + color + ". " +
               "It has " + numberOfPaws +  (numberOfPaws!=1 ? " paws" : " paw") +
               " and " + (hasFur  ? "a " : "no ") + "fur." + " Moreover, it has 2 wings and can fly.";
    }
}
