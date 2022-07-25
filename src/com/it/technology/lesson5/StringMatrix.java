package com.it.technology.lesson5;

public class StringMatrix {
    private int rows;
    private int columns;
    private String[][] data;

    public StringMatrix(int size) {
        if (size <= 0) throw new RuntimeException("Illegal matrix dimensions");
        this.rows = size;
        this.columns = size;
        data = new String[size][size];
    }

    public void staggeredFilling() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ( (i % 2) == (j % 2)) {
                    data[i][j] = "W";
                }
                else {
                    data[i][j] = "B";
                }
            }
        }
    }

    public void printValuesStringMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
