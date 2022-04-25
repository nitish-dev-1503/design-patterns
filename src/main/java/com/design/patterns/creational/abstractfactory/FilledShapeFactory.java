package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.rectangle.FilledRectangle;
import com.design.patterns.creational.abstractfactory.rectangle.Rectangle;
import com.design.patterns.creational.abstractfactory.triangle.FilledTriangle;
import com.design.patterns.creational.abstractfactory.triangle.Triangle;

public class FilledShapeFactory implements ShapeFactory {
    @Override
    public Triangle createTriangle() {
        return new FilledTriangle();
    }

    @Override
    public Rectangle createRectangle() {
        return new FilledRectangle();
    }
}
