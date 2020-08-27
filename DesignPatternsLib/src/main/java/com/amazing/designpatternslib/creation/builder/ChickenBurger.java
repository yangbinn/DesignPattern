package com.amazing.designpatternslib.creation.builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50f;
    }
}
