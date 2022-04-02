package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.rectangle.Rectangle;
import com.design.patterns.abstractfactory.rectangle.RoundedRectangle;
import com.design.patterns.abstractfactory.triangle.RoundedTriangle;
import com.design.patterns.abstractfactory.triangle.Triangle;

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
