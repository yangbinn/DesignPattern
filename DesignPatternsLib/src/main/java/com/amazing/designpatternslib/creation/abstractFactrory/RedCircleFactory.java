package com.amazing.designpatternslib.creation.abstractFactrory;

import com.amazing.designpatternslib.creation.factory.Circle;
import com.amazing.designpatternslib.creation.factory.IShape;

public class RedCircleFactory extends AbstractFactory{
    @Override
    public IColor getColor() {
        return new Red();
    }

    @Override
    public IShape getShape() {
        return new Circle();
    }
}
