package com.design.patterns.abstractfactory.triangle;

public class RoundedTriangle implements Triangle {
    @Override
    public void draw() {
        System.out.println("Drawing a rounded triangle");
    }
}
