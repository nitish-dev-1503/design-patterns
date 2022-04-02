package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.rectangle.Rectangle;
import com.design.patterns.abstractfactory.triangle.Triangle;

public interface ShapeFactory {
    Triangle createTriangle();

    Rectangle createRectangle();
}
