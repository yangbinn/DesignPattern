package com.amazing.designpatternslib.structure.bridge;

public class BlueColor implements IColor {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + ", 蓝色的" + name);
    }
}
