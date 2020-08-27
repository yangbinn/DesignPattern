package com.amazing.designpatternslib.creation.builder;

public abstract class ClodDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
