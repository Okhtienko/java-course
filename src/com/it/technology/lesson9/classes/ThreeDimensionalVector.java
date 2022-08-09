package com.it.technology.lesson9.classes;

import com.it.technology.lesson9.interfaces.Calculatetable;
import com.it.technology.lesson9.interfaces.Displayable;
import com.it.technology.lesson9.utils.RandomUtils;
import java.util.ArrayList;

public class ThreeDimensionalVector implements Calculatetable<ThreeDimensionalVector>,
        Displayable, Comparable<ThreeDimensionalVector> {

    private double coordinatesListX;
    private double coordinatesListY;
    private double coordinatesListZ;

    private static final String VECTOR_INFORMATION = "Vector for a three-dimensional coordinate system";

    public ThreeDimensionalVector(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinatesListX = coordinateX;
        this.coordinatesListY = coordinateY;
        this.coordinatesListZ = coordinateZ;
    }

    public double getCoordinatesListX() {
        return coordinatesListX;
    }

    public double getCoordinatesListY() {
        return coordinatesListY;
    }

    public double getCoordinatesListZ() {
        return coordinatesListZ;
    }

    @Override
    public double calculateLength() {
        return Math.sqrt(Math.pow(coordinatesListX, 2) +
                Math.pow(coordinatesListY, 2) +
                Math.pow(coordinatesListZ, 2));
    }

    @Override
    public double scalarProduct(ThreeDimensionalVector vector) {
        return coordinatesListX * vector.getCoordinatesListX() +
                coordinatesListY * vector.getCoordinatesListY() +
                coordinatesListZ * vector.getCoordinatesListZ();
    }

    @Override
    public ThreeDimensionalVector add(ThreeDimensionalVector vector) {
        return new ThreeDimensionalVector(coordinatesListX + vector.getCoordinatesListX(),
                coordinatesListY + vector.getCoordinatesListY(),
                coordinatesListZ + vector.getCoordinatesListZ());
    }

    @Override
    public ThreeDimensionalVector subtract(ThreeDimensionalVector vector) {
        return new ThreeDimensionalVector(coordinatesListX - vector.coordinatesListX,
                coordinatesListY - vector.getCoordinatesListY(),
                coordinatesListZ - vector.getCoordinatesListZ());
    }

    @Override
    public void displayInformation() {
        System.out.printf("%s%s%.2f%s%.2f%s%.2f%n",
                VECTOR_INFORMATION,
                ": ",
                coordinatesListX,
                "  ",
                coordinatesListZ,
                "  ",
                coordinatesListZ);
    }

    public static ArrayList<ThreeDimensionalVector> generate(int size) {
        ArrayList<ThreeDimensionalVector> vector = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            vector.add(new ThreeDimensionalVector(RandomUtils.generateRandomValue(1, 3),
                    RandomUtils.generateRandomValue(-3, -1),
                    RandomUtils.generateRandomValue(-3, 3)));
        }
        return vector;
    }

    public static void printList(ArrayList<ThreeDimensionalVector> vectorsList) {
        for (int i = 0; i < vectorsList.size(); i++) {
            final ThreeDimensionalVector vector = vectorsList.get(i);
            vector.displayInformation();
        }
    }

    @Override
    public int compareTo(ThreeDimensionalVector vector) {
        return Double.compare(this.calculateLength(), vector.calculateLength());
    }
}
