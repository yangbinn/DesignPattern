package com.amazing.designpatternslib.creation.factory;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
