package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.rectangle.FilledRectangle;
import com.design.patterns.abstractfactory.rectangle.Rectangle;
import com.design.patterns.abstractfactory.triangle.FilledTriangle;
import com.design.patterns.abstractfactory.triangle.Triangle;

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
