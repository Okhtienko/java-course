package com.it.technology.lesson9.classes;

import com.it.technology.lesson9.enums.VectorType;
import com.it.technology.lesson9.services.ServiceThreeDimensionalVector;
import com.it.technology.lesson9.services.ServiceTwoDimensionalVectorUtils;
import com.it.technology.lesson9.services.ServiceVector;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("##########Task1##########\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Two-dimensional vector;");
        System.out.println("2. Three-dimensional vector;");
        System.out.println("3. Vector.");
        System.out.println();

        System.out.print("Input the number that corresponds to the vector oscillations: ");

        String n = scanner.next();
        VectorType vectorType = VectorType.getEnum(n);

        ArrayList<Double> firstArbitraryVector = new ArrayList<>();
        firstArbitraryVector.add(2.7);
        firstArbitraryVector.add(-1.4);
        firstArbitraryVector.add(3.2);
        firstArbitraryVector.add(-0.7);
        firstArbitraryVector.add(6.1);

        ArrayList<Double> secondArbitraryVector = new ArrayList<>();
        secondArbitraryVector.add(7.2);
        secondArbitraryVector.add(-4.1);
        secondArbitraryVector.add(-2.3);
        secondArbitraryVector.add(0.5);
        secondArbitraryVector.add(1.1);

        switch (vectorType) {
            case TWO_DIMENSIONAL_VECTOR -> {
                TwoDimensionalVector firstVector = new TwoDimensionalVector(0, 0);
                TwoDimensionalVector secondVector = new TwoDimensionalVector(1, 2);
                ServiceTwoDimensionalVectorUtils serviceVectorUtils = new ServiceTwoDimensionalVectorUtils();
                serviceVectorUtils.service(firstVector, secondVector);
                break;
            }
            case THREE_DIMENSIONAL_VECTOR -> {
                ThreeDimensionalVector firstVector = new ThreeDimensionalVector(2, 1, 2);
                ThreeDimensionalVector secondVector = new ThreeDimensionalVector(3, -2, 1);
                ServiceThreeDimensionalVector serviceVectorUtils = new ServiceThreeDimensionalVector();
                serviceVectorUtils.service(firstVector, secondVector);
                break;
            }
            case VECTOR -> {
                Vector firstVector = new Vector(firstArbitraryVector);
                Vector secondVector = new Vector(secondArbitraryVector);
                ServiceVector serviceVectorUtils = new ServiceVector();
                serviceVectorUtils.service(firstVector, secondVector);
                break;
            }
        }
    }
}
