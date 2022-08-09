package com.it.technology.lesson7.shape;

public abstract class Shape {
    private String nameShape;

    public Shape(String nameShape) {
        this.nameShape = nameShape;
    }

    public String getNameShape() {
        return nameShape;
    }

    public abstract double calculatingSquareOfShape();
    public abstract double calculatingPerimeterOfShape();
}
