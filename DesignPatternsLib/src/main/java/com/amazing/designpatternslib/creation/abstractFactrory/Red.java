package com.amazing.designpatternslib.creation.abstractFactrory;

public class Red implements IColor{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
