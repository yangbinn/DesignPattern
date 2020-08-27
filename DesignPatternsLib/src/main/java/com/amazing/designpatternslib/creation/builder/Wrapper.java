package com.amazing.designpatternslib.creation.builder;

/**
 * 包装纸
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
