package com.it.technology.lesson9.services;

import com.it.technology.lesson9.classes.ThreeDimensionalVector;
import com.it.technology.lesson9.interfaces.Serviceable;
import com.it.technology.lesson9.utils.OperatorUtils;

import java.util.ArrayList;

public final class ServiceThreeDimensionalVector implements Serviceable<ThreeDimensionalVector> {

    @Override
    public void service(ThreeDimensionalVector firstVector, ThreeDimensionalVector secondVector) {
        System.out.println("\nScalar product of vectors:\n" +
                firstVector.scalarProduct(secondVector) + "\n");

        System.out.println("Vector addition: ");
        ThreeDimensionalVector thirdVector = firstVector.add(secondVector);
        thirdVector.displayInformation();

        System.out.println("\nVector subtraction: ");
        ThreeDimensionalVector fourthVector = firstVector.subtract(secondVector);
        fourthVector.displayInformation();

        System.out.println("\nGeneration of a list of random vectors: ");
        ArrayList<ThreeDimensionalVector> randomVectorList = ThreeDimensionalVector.generate(5);
        ThreeDimensionalVector.printList(randomVectorList);

        System.out.println("\nVector Comparison: ");
        OperatorUtils.checkOperatorKey(firstVector.compareTo(secondVector));
    }
}
