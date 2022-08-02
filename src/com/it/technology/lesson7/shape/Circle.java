package com.it.technology.lesson7.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String nameShape, double radius) {
        super(nameShape);
        this.radius = radius;
    }

    @Override
    public double calculatingSquareOfShape() {
        return Math.floor(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatingPerimeterOfShape() {
        return Math.floor(2.0 * Math.PI * radius);
    }
}
