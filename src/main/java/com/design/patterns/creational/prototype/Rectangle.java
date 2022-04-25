package com.design.patterns.creational.prototype;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public Rectangle(Rectangle source) {
        super(source.getX(), source.getY());
        this.length = source.length;
        this.breadth = source.breadth;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", x=" + getX() +
                ", y=" + getY() +
                "} ";
    }
}
