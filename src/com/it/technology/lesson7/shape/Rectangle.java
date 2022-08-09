package com.it.technology.lesson7.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String nameShape, double length, double width) {
        super(nameShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatingSquareOfShape() {
        return Math.floor(length * width);
    }

    @Override
    public double calculatingPerimeterOfShape() {
        return Math.floor(2.0 * (length + width));
    }
}
