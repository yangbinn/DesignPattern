package com.amazing.designpatternslib.creation.builder;

public class Pepsi extends ClodDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5f;
    }
}
