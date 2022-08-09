package com.it.technology.lesson9.services;

import com.it.technology.lesson9.classes.Vector;
import com.it.technology.lesson9.interfaces.Serviceable;
import com.it.technology.lesson9.utils.OperatorUtils;

import java.util.ArrayList;

public final class ServiceVector implements Serviceable<Vector> {

    @Override
    public void service(Vector firstVector, Vector secondVector) {
        System.out.println("\nScalar product of vectors:\n" +
                firstVector.scalarProduct(secondVector) + "\n");

        System.out.println("Vector addition: ");
        Vector thirdVector = firstVector.add(secondVector);
        thirdVector.displayInformation();

        System.out.println("\n\nVector subtraction: ");
        Vector fourthVector = firstVector.subtract(secondVector);
        fourthVector.displayInformation();

        System.out.println("\n\nGeneration of a list of random vectors: ");
        ArrayList<Vector> randomVectorList = Vector.generate(5);
        Vector.printList(randomVectorList);

        System.out.println("\nVector Comparison: ");
        OperatorUtils.checkOperatorKey(firstVector.compareTo(secondVector));
    }
}
