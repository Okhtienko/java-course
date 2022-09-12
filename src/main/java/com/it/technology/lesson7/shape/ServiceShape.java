package com.it.technology.lesson7.shape;

import java.util.HashMap;

public class ServiceShape {
    public HashMap<String, Double> creatingArrayOfShapePerimeters(Shape[] shapes) {
        HashMap<String, Double> shapePerimeters = new HashMap<>();
        for(Shape shape : shapes) {
            shapePerimeters.put(shape.getNameShape(), shape.calculatingPerimeterOfShape());
        }

        return shapePerimeters;
    }

    public HashMap<String, Double> creatingArrayOfShapeSquare(Shape[] shapes) {
        HashMap<String, Double> shapeSquare = new HashMap<>();
        for(Shape shape : shapes) {
           shapeSquare.put(shape.getNameShape(), shape.calculatingSquareOfShape());
        }

        return shapeSquare;
    }

    public void displayInformation(HashMap<String, Double> shapeInformation) {
        for (String key : shapeInformation.keySet()) {
            System.out.println(key + " - " + shapeInformation.get(key));
        }
    }
}
