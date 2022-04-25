package com.design.patterns.creational.abstractfactory.rectangle;

public class RoundedRectangle implements Rectangle {
    @Override
    public void draw() {
        System.out.println("Drawing a rounded rectangle");
    }
}
