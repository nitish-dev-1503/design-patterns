package com.design.patterns.abstractfactory.rectangle;

public class FilledRectangle implements Rectangle {
    @Override
    public void draw() {
        System.out.println("Drawing a filled rectangle");
    }
}
