package com.amazing.designpatternslib.creation.abstractFactrory;

public class Blue implements IColor{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
