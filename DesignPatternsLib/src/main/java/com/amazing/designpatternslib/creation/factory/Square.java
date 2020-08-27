package com.amazing.designpatternslib.creation.factory;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
