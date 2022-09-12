package com.it.technology.lesson9.services;

import com.it.technology.lesson9.classes.TwoDimensionalVector;
import com.it.technology.lesson9.interfaces.Serviceable;
import com.it.technology.lesson9.utils.OperatorUtils;

import java.util.ArrayList;

public final class ServiceTwoDimensionalVectorUtils implements Serviceable<TwoDimensionalVector> {

    @Override
    public void service(TwoDimensionalVector firstVector, TwoDimensionalVector secondVector) {
        System.out.println("\nScalar product of vectors:\n" +
                firstVector.scalarProduct(secondVector) + "\n");

        System.out.println("Vector addition: ");
        TwoDimensionalVector thirdVector = firstVector.add(secondVector);
        thirdVector.displayInformation();

        System.out.println("\nVector subtraction: ");
        TwoDimensionalVector fourthVector = firstVector.subtract(secondVector);
        fourthVector.displayInformation();

        System.out.println("\nGeneration of a list of random vectors: ");
        ArrayList<TwoDimensionalVector> randomVectorList = TwoDimensionalVector.generate(5);
        TwoDimensionalVector.printList(randomVectorList);

        System.out.println("\nVector Comparison: ");
        OperatorUtils.checkOperatorKey(firstVector.compareTo(secondVector));
    }
}
