package com.amazing.designpatternslib.creation.builder;

/**
 * 瓶子
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
