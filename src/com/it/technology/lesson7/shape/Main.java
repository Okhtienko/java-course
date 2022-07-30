package com.it.technology.lesson7.shape;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task1##########\n");

        Rectangle firstRectangle = new Rectangle("First rectangle",
                10,
                5);

        Rectangle secondRectangle = new Rectangle("Second rectangle",
                4,
                12);

        Circle firstCircle = new Circle("First circle", 5);
        Circle secondCircle = new Circle("Second circle", 7);

        Triangle firstTriangle = new Triangle("First triangle",
                3,
                4,
                5);

        Triangle secondTriangle = new Triangle("Second triangle",
                5,
                6,
                9);

        Shape[] shapes = { firstRectangle, firstCircle, firstTriangle, secondRectangle, secondCircle, secondTriangle};

        ServiceShape serviceShape = new ServiceShape();
        serviceShape.displayInformation(serviceShape.creatingArrayOfShapePerimeters(shapes));
    }
}
