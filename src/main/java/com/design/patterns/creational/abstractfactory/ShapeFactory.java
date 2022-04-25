package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.rectangle.Rectangle;
import com.design.patterns.creational.abstractfactory.triangle.Triangle;

public interface ShapeFactory {
    Triangle createTriangle();

    Rectangle createRectangle();
}
