package com.it.technology.lesson5;

import java.util.Arrays;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    private static final int LOWER_BORDER = 0;
    private static final int UPPER_BORDER = 9;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public Matrix(int[][] data) {
        rows = data.length;
        columns = data[0].length;
        this.data = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public void fillingMatrixRandomNumbers() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = (int) (Math.random() * (UPPER_BORDER - LOWER_BORDER +1)) + LOWER_BORDER;
            }
        }
    }

    public void printValuesMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiplicationMatrix(Matrix secondMatrix) {
        Matrix firstMatrix = this;
        if (firstMatrix.columns != secondMatrix.rows) throw new RuntimeException("Illegal matrix dimensions");
        Matrix resultMatrix = new Matrix(firstMatrix.rows, secondMatrix.columns);
        for (int i = 0; i < resultMatrix.rows; i++) {
            for (int j = 0; j < resultMatrix.columns; j++) {
                for (int k = 0; k < firstMatrix.columns; k++) {
                    resultMatrix.data[i][j] += firstMatrix.data[i][k] * secondMatrix.data[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public int sumElementsMatrix() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += data[i][j];
            }
        }
        return sum;
    }

    public int[] gettingMainDiagonalMatrix() {
        if (rows != columns) throw new RuntimeException("Illegal matrix dimensions");
        int[] array = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ( i == j) {
                    array[i] += data[i][j];
                }
            }
        }
        return array;
    }

    public int[] gettingSecondaryDiagonalMatrix() {
        if (rows != columns) throw new RuntimeException("Illegal matrix dimensions");
        int[] array = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ( i == rows - j - 1) {
                    array[i] += data[i][j];
                }
            }
        }
        return array;
    }

    public void sortingMatrixRows() {
        for (int i = 0; i < rows; i++) {
            Arrays.sort(data[i]);
        }
    }
}
