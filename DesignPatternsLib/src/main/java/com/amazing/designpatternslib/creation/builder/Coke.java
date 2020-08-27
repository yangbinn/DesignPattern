package com.amazing.designpatternslib.creation.builder;

public class Coke extends ClodDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30f;
    }
}
