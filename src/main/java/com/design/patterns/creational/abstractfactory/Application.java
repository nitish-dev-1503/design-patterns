package com.design.patterns.creational.abstractfactory;

public class Application {
    private static ShapeFactory shapeFactory;

    private enum type {ROUNDED, FILLED}

    public static void main(String[] args) {
        var type = Application.type.ROUNDED;
        init(type);

        var triangle = shapeFactory.createTriangle();
        var rectangle = shapeFactory.createRectangle();

        triangle.draw();
        rectangle.draw();
    }

    private static void init(type type) {
        switch (type) {
            case ROUNDED -> shapeFactory = new RoundedShapeFactory();
            case FILLED -> shapeFactory = new FilledShapeFactory();
        }
    }
}
