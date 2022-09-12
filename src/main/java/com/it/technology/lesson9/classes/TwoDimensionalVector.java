package com.it.technology.lesson9.classes;

import com.it.technology.lesson9.interfaces.Calculatetable;
import com.it.technology.lesson9.interfaces.Displayable;
import com.it.technology.lesson9.utils.RandomUtils;

import java.util.ArrayList;

public class TwoDimensionalVector implements Calculatetable<TwoDimensionalVector>,
        Displayable, Comparable<TwoDimensionalVector> {

    private double coordinatesListX;
    private double coordinatesListY;

    private static final String VECTOR_INFORMATION = "Vector for a two-dimensional coordinate system";

    public TwoDimensionalVector(double coordinateX, double coordinateY) {
        this.coordinatesListX = coordinateX;
        this.coordinatesListY = coordinateY;
    }

    public double getCoordinatesListX() {
        return coordinatesListX;
    }

    public double getCoordinatesListY() {
        return coordinatesListY;
    }

    @Override
    public double calculateLength() {
        return Math.sqrt(Math.pow(coordinatesListX, 2) + Math.pow(coordinatesListY, 2));
    }

    @Override
    public double scalarProduct(TwoDimensionalVector vector) {
        return coordinatesListX * vector.getCoordinatesListX() + coordinatesListY * vector.coordinatesListY;
    }

    @Override
    public TwoDimensionalVector add(TwoDimensionalVector vector) {
        return new TwoDimensionalVector(coordinatesListX + vector.getCoordinatesListX(),
                coordinatesListY + vector.getCoordinatesListY());
    }

    @Override
    public TwoDimensionalVector subtract(TwoDimensionalVector vector) {
        return new TwoDimensionalVector(coordinatesListX - vector.getCoordinatesListX(),
                coordinatesListY - vector.getCoordinatesListY());
    }

    @Override
    public void displayInformation() {
        System.out.printf("%s%s%.2f%s%.2f%n",
                VECTOR_INFORMATION,
                ": ",
                coordinatesListX,
                "  ",
                coordinatesListY);
    }

    public static ArrayList<TwoDimensionalVector> generate(int size) {
        ArrayList<TwoDimensionalVector> vector = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            vector.add(new TwoDimensionalVector(RandomUtils.generateRandomValue(-1, 3),
                    RandomUtils.generateRandomValue(-3, 1)));
        }
        return vector;
    }

    public static void printList(ArrayList<TwoDimensionalVector> vectorsList) {
        for (int i = 0; i < vectorsList.size(); i++) {
            final TwoDimensionalVector vector = vectorsList.get(i);
            vector.displayInformation();
        }
    }

    @Override
    public int compareTo(TwoDimensionalVector vector) {
        return Double.compare(this.calculateLength(), vector.calculateLength());
    }
}
