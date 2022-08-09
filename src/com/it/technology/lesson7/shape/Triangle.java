package com.it.technology.lesson7.shape;

public class Triangle extends Shape {
    private double firstSideOfTriangle;
    private double secondSideOfTriangle;
    private double thirdSideOfTriangle;

    public Triangle(String nameShape,
                    double firstSideOfTriangle,
                    double secondSideOfTriangle,
                    double thirdSideOfTriangle)
    {
        super(nameShape);
        this.firstSideOfTriangle = firstSideOfTriangle;
        this.secondSideOfTriangle = secondSideOfTriangle;
        this.thirdSideOfTriangle = thirdSideOfTriangle;
    }

    private boolean isTriangle() {
        if ((firstSideOfTriangle + secondSideOfTriangle > thirdSideOfTriangle)
                && (firstSideOfTriangle + thirdSideOfTriangle > secondSideOfTriangle)
                && (secondSideOfTriangle + thirdSideOfTriangle > firstSideOfTriangle)) {
            return true;
        }

        return false;
    }

    @Override
    public double calculatingSquareOfShape() {
        double squareTriangle = 0.0;
        if (isTriangle() == true) {
            double semiPerimeter = calculatingPerimeterOfShape() / 2;
            squareTriangle = Math.floor(Math.sqrt(semiPerimeter
                    * (semiPerimeter - firstSideOfTriangle)
                    * (semiPerimeter - secondSideOfTriangle)
                    * (semiPerimeter - thirdSideOfTriangle)));
        }

        return squareTriangle;
    }

    @Override
    public double calculatingPerimeterOfShape() {
        double perimeterTriangle = 0.0;
        if (isTriangle() == true) {
            perimeterTriangle = Math.floor(firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle);
        }

        return perimeterTriangle;
    }
}
