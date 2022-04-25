package com.design.patterns.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
    }

    public Circle(Circle source) {
        super(source.getX(), source.getY());
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + getX() +
                ", y=" + getY() +
                "} ";
    }
}
