package com.amazing.designpatternslib.creation.abstractFactrory;

import com.amazing.designpatternslib.creation.factory.IShape;

public class Test {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new RedCircleFactory();
        IColor iColor = abstractFactory.getColor();
        iColor.fill();

        IShape iShape = abstractFactory.getShape();
        iShape.draw();

    }

}
