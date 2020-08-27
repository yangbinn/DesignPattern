package com.amazing.designpatternslib.creation.abstractFactrory;

import com.amazing.designpatternslib.creation.factory.IShape;

public abstract class AbstractFactory {

    public abstract IColor getColor();

    public abstract IShape getShape();

}
