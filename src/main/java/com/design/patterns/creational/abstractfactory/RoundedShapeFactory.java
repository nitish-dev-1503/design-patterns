package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.rectangle.Rectangle;
import com.design.patterns.creational.abstractfactory.rectangle.RoundedRectangle;
import com.design.patterns.creational.abstractfactory.triangle.RoundedTriangle;
import com.design.patterns.creational.abstractfactory.triangle.Triangle;

public class RoundedShapeFactory implements ShapeFactory {
    @Override
    public Triangle createTriangle() {
        return new RoundedTriangle();
    }

    @Override
    public Rectangle createRectangle() {
        return new RoundedRectangle();
    }
}
