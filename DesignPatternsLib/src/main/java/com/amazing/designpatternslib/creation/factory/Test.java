package com.amazing.designpatternslib.creation.factory;

public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape IShape = shapeFactory.getShape("circle");
        if(IShape != null){
            IShape.draw();
        }else{
            System.out.println("shape is null");
        }

    }

}
