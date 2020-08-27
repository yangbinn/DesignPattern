package com.amazing.designpatternslib.structure.bridge;

public class RedColor implements IColor {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + ", 红色的" + name);
    }
}
