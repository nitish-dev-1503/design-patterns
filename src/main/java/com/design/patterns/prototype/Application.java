package com.design.patterns.prototype;

public class Application {

    public static void main(String[] args) {
        var circle = new Circle(1, 2);
        circle.setRadius(20);
        System.out.println("CIRCLE: " + circle);

        var clonedCircle = circle.clone();
        System.out.println("CLONED CIRCLE: " + clonedCircle);

        var rectangle = new Rectangle(2, 4);
        rectangle.setLength(40);
        rectangle.setBreadth(20);
        System.out.println("RECTANGLE: " + rectangle);

        var clonedRectangle = rectangle.clone();
        System.out.println("CLONED RECTANGLE: " + clonedRectangle);
    }
}
