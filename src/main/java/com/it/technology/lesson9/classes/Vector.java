package com.it.technology.lesson9.classes;

import com.it.technology.lesson9.interfaces.Calculatetable;
import com.it.technology.lesson9.interfaces.Displayable;
import com.it.technology.lesson9.utils.RandomListUtils;
import java.util.ArrayList;

public class Vector implements Calculatetable<Vector>,
        Displayable, Comparable<Vector>{

    private ArrayList<Double> coordinatesList;

    private static final String VECTOR_INFORMATION = "Arbitrary vector";

    public Vector(ArrayList<Double> coordinatesList) {
        this.coordinatesList = coordinatesList;
    }

    public ArrayList<Double> getCoordinatesList() {
        return coordinatesList;
    }

    @Override
    public double calculateLength() {
        double sum = 0;
        for (double value : coordinatesList) {
            sum += Math.pow(value, 2);
        }
        return Math.sqrt(sum);
    }

    @Override
    public double scalarProduct(Vector vector) {
        double scalar = 0;
        final  ArrayList<Double> vectorList = vector.getCoordinatesList();
        for (int i = 0; i < coordinatesList.size(); i++) {
            scalar += coordinatesList.get(i) * vectorList.get(i);
        }
        return scalar;
    }

    @Override
    public Vector add(Vector vector) {
        ArrayList<Double> object = new ArrayList<>();
        final  ArrayList<Double> vectorList = vector.getCoordinatesList();
        for (int i = 0; i < coordinatesList.size(); i++) {
            object.add(coordinatesList.get(i) + vectorList.get(i));
        }
        return new Vector(object);
    }

    @Override
    public Vector subtract(Vector vector) {
        ArrayList<Double> object = new ArrayList<>();
        final ArrayList<Double> vectorList = vector.getCoordinatesList();
        for (int i = 0; i < coordinatesList.size(); i++) {
            object.add(coordinatesList.get(i) - vectorList.get(i));
        }
        return new Vector(object);
    }

    @Override
    public void displayInformation() {
        System.out.print(VECTOR_INFORMATION + ": ");
        for (double value : coordinatesList) {
            System.out.printf("%.2f%s", value, "  ");
        }
    }

    public static ArrayList<Vector> generate(int size) {
        ArrayList<Vector> vector = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            vector.add(new Vector(RandomListUtils.generateRandomList(size)));
        }
        return vector;
    }

    public static void printList(ArrayList<Vector> vectorsList) {
        for (int i = 0; i < vectorsList.size(); i++) {
            final Vector vector = vectorsList.get(i);
            vector.displayInformation();
            System.out.println();
        }
    }

    @Override
    public int compareTo(Vector vector) {
        return Double.compare(this.calculateLength(), vector.calculateLength());
    }
}

