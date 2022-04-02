package com.design.patterns.abstractfactory.triangle;

public class FilledTriangle implements Triangle {
    @Override
    public void draw() {
        System.out.println("Drawing a filled triangle");
    }
}
