package com.it.technology.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_CELLS = 8;

        System.out.print("#############Task1#############\n");

        int[][][] threeArray = new int[][][]{{{1,2},{3,4},{5,6}},{{7,8},{9,1},{2,3}}};
        ThreeDimArray threeDimArray = new ThreeDimArray(threeArray);
        System.out.print("Tri dim before after multiplication:\n");
        threeDimArray.printValuesThreeDimArray();
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        threeDimArray.multiplicationElementsThreeDimArray(number);
        System.out.print("Tri dim array after multiplication:\n");
        threeDimArray.printValuesThreeDimArray();

        System.out.print("#############Task2#############\n");

        StringMatrix checkerBoarding = new StringMatrix(NUMBER_CELLS);
        checkerBoarding.staggeredFilling();
        checkerBoarding.printValuesStringMatrix();

        System.out.print("#############Task3#############\n");

        int[][] first = new int[][]{{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] second = new int[][]{{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        Matrix matrixFirst = new Matrix(first);
        Matrix matrixSecond = new Matrix(second);
        matrixFirst.multiplicationMatrix(matrixSecond).printValuesMatrix();

        System.out.print("#############Task4#############\n");

        System.out.print("Enter the number of matrix rows: ");
        int counterRows = scanner.nextInt();
        System.out.print("Enter the number of matrix columns: ");
        int counterColumns = scanner.nextInt();
        Matrix matrix = new Matrix(counterRows, counterColumns);
        matrix.fillingMatrixRandomNumbers();
        matrix.printValuesMatrix();
        System.out.print("Sum of matrix elements: " + matrix.sumElementsMatrix());

        System.out.print("\n#############Task5#############\n");

        System.out.print("Main Diagonal of the matrix: " + Arrays.toString(matrix.gettingMainDiagonalMatrix()));
        System.out.print("\nSecondary Diagonal of the matrix: " + Arrays.toString(matrix.gettingSecondaryDiagonalMatrix()));

        System.out.print("\n#############Task6#############\n");
        System.out.print("Matrix before sorting:\n");
        matrix.printValuesMatrix();
        System.out.print("Matrix after sorting:\n");
        matrix.sortingMatrixRows();
        matrix.printValuesMatrix();

    }
}
