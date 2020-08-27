package com.amazing.designpatternslib.structure.bridge;

public class WhiteColor implements IColor {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + ", 白色的" + name);
    }
}