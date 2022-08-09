package com.it.technology.lesson5;

public class ThreeDimArray {
    private int rows;
    private int columns;
    private int depth;
    private int[][][] array;

    public ThreeDimArray(int rows, int columns, int depth) {
        this.rows = rows;
        this.columns = columns;
        this.depth = depth;
        array = new int[rows][columns][depth];
    }

    public ThreeDimArray(int[][][] array) {
        rows = array.length;
        columns = array[0].length;
        depth = array[0][0].length;
        this.array = new int[rows][columns][depth];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    this.array[i][j][k] = array[i][j][k];
                }
            }
        }
    }

    public void multiplicationElementsThreeDimArray(int number) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    array[i][j][k] *= number;
                }
            }
        }
    }

    public void printValuesThreeDimArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
