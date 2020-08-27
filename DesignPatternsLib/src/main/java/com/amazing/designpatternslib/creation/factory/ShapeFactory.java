package com.amazing.designpatternslib.creation.factory;

public class ShapeFactory {

    public IShape getShape(String shapeType) {
        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }

}
